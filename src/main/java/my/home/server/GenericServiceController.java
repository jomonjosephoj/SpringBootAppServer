package my.home.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GenericServiceController {

	@Autowired
	private GenericServiceBean gsb;

	@RequestMapping("/GenericService")
	@ResponseBody
	public String greeting(@RequestParam(value = "name", defaultValue = "Joseph") String name) {
		gsb.setContent(name);
		return gsb.getContent();
	}
}
