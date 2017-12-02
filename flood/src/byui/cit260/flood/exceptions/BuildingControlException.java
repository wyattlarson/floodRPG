/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.exceptions;

/**
 *
 * @author Ryan Call
 */
public class BuildingControlException extends Exception {

    public BuildingControlException() {

    }

    public BuildingControlException(String message) {
        super(message);
    }

    public BuildingControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public BuildingControlException(Throwable cause) {
        super(cause);
    }

    public BuildingControlException(String message,
            Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
