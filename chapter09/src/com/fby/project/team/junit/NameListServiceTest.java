package com.fby.project.team.junit;

import com.fby.project.team.domain.Employee;
import com.fby.project.team.service.NameListService;
import com.fby.project.team.service.TeamException;
import org.junit.Test;

/**
 * ClassName: NameListServiceTest
 * Package: com.fby.project.team.junit
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/4 - 4:58
 * @Version: V0.1
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees() {
        NameListService nameListService = new NameListService();
        Employee[] employees = nameListService.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Test
    public void setGetEmployee() {
        try {
            NameListService nameListService = new NameListService();
            int id = 3;
            Employee employee = nameListService.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}