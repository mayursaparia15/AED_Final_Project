/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vinithhiteshharsora
 */

//Initializing  class  LocalHealthDepartment extends Enterprise
public class LocalHealthDepartment extends Enterprise {

    public LocalHealthDepartment(String stateName) {
        super(stateName, EnterpriseType.LocalHealthDepartment);
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
