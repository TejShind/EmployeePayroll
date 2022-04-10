package service;

import com.blz.model.EmployeePayroll;
import com.blz.service.EmployeePayrollService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollTest {


    @Test
    public void given3EntriesWhenWriteToFilesShouldMatchExactEntries() {
        List<EmployeePayroll> list = new ArrayList<>();
        list.add(new EmployeePayroll("Tej", 1, 654564));
        list.add(new EmployeePayroll("Swapnil", 2, 452345));
        list.add(new EmployeePayroll("Prisha", 3, 998464));
        EmployeePayrollService service = new EmployeePayrollService(list);
        service.writeToFile();
        service.printData();
        Assert.assertEquals(3,service.countEntries());
    }
}