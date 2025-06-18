public class nodeMotor {
    nodeMotor next;
    motor data;

    public nodeMotor(nodeMotor next, motor data) {
        this.next = next;
        this.data =data;
    }
}
