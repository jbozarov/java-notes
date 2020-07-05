

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeltsController {

	@Autowired
	EmployeeltsService es;

//http://localhost:8091/addEmployeelts
	@RequestMapping(value = "/addEmployeelts", method = RequestMethod.POST)
	public String m1(@RequestBody Employeelts emp) {

		System.out.println("addEmployeelts method");
		es.addEmployee(emp);
		return "Inserted successfully";
	}

	// http://localhost:8091/addEmployeelts
	@RequestMapping(value = "/addEmployeelts", method = RequestMethod.GET)
	public List<Employeelts> m2() {
		return es.getAllEmployeelts();
	}

	//http://localhost:8091/emp/51
	@RequestMapping(value = "/emp/{empid}", method = RequestMethod.GET)
	public Employeelts m3(@PathVariable("empid") int empid) {
		return es.getEmployee(empid);
	}

	//http://localhost:8091/emp/51
	@RequestMapping(value = "/emp/{empid}", method = RequestMethod.DELETE)
	public void m4(@PathVariable("empid") int empid) {
		System.out.println("emp delete  method is invoked");
		es.deleteEmployee(empid);
		System.out.println("Delete successfully");
	}
	
	//http://localhost:8091/addEmployeelts/update
	@RequestMapping(value = "/addEmployeelts/update", method = RequestMethod.PUT)
	public String m5(@RequestBody Employeelts emp) {

		System.out.println("addEmployeelts update method");
		es.updateEmployee(emp);
		return "updated successfully";
	}

}
