package org.springframework.samples.petclinic.rest.dto;

public class VetShiftRosterDto {
    private Integer shiftId;
    private Integer vetId;
    private String slotTime;

    public Integer getShiftId() { return shiftId; }
    public void setShiftId(Integer shiftId) { this.shiftId = shiftId; }
    public Integer getVetId() { return vetId; }
    public void setVetId(Integer vetId) { this.vetId = vetId; }
    public String getSlotTime() { return slotTime; }
    public void setSlotTime(String slotTime) { this.slotTime = slotTime; }
}
