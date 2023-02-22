/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
class StatusUser {

    public void statusDetail(StatusEnum status) {
        switch (status) {
            case REJECTED:
                System.out.println("User is rejected");
                break;
            case PENDING:
                System.out.println("User is pending");
                break;
            case PROCESSING:
                System.out.println("User is being processed");
                break;
            case APPROVED:
                System.out.println("User is approved");
                break;
        }
    }
}