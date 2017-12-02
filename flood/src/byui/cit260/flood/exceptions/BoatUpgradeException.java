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
public class BoatUpgradeException extends Exception {

    public BoatUpgradeException() {

    }

    public BoatUpgradeException(String message) {
        super(message);
    }

    public BoatUpgradeException(String message, Throwable cause) {
        super(message, cause);
    }

    public BoatUpgradeException(Throwable cause) {
        super(cause);
    }

    public BoatUpgradeException(String message,
            Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
