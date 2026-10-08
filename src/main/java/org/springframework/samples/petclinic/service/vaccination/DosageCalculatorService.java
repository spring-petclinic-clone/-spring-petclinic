package org.springframework.samples.petclinic.service.vaccination;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Service;

@Service
public class DosageCalculatorService {

    private final ExpressionParser parser = new SpelExpressionParser();

    public Object calculateDynamicDosage(String formula) {
        return parser.parseExpression(formula).getValue();
    }
}
