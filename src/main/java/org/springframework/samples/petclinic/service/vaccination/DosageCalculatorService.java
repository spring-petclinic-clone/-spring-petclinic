package org.springframework.samples.petclinic.service.vaccination;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Service;

@Service
public class DosageCalculatorService {

    public Double calculateDynamicDosage(Double weightKg, String customFormula) {
        if (customFormula == null || customFormula.isBlank()) {
            return weightKg * 0.25;
        }
        ExpressionParser parser = new SpelExpressionParser();
        Object val = parser.parseExpression(customFormula).getValue();
        if (val instanceof Number) {
            return ((Number) val).doubleValue();
        }
        return weightKg * 0.25;
    }
}
