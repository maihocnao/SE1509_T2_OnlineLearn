/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author cyv2098
 */
public class NumberProccessing {

    public static int paramToInteger(HttpServletRequest request, String paramName)
            throws NumberFormatException {
        return Integer.parseInt(request.getParameter(paramName));
    }

    public static float paramToFloat(HttpServletRequest request, String paramName)
            throws NumberFormatException {
        return Float.parseFloat(request.getParameter(paramName));
    }
}
