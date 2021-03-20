package com.wwwamaurylog.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wwwamaurylog.springboot.web.app.models.Printer;

import fr.w3blog.zpl.constant.ZebraFont;
import fr.w3blog.zpl.model.ZebraLabel;
import fr.w3blog.zpl.model.ZebraPrintException;
import fr.w3blog.zpl.model.ZebraUtils;
import fr.w3blog.zpl.model.element.ZebraBarCode39;
import fr.w3blog.zpl.model.element.ZebraText;
import fr.w3blog.zpl.utils.ZplUtils;

@Controller
@RequestMapping("/zebra")
public class ImpresionController {

	@GetMapping(value = {"/index", "", "/"})
	public String index(Model model)
	{
		return "zebra/index";
	}
	
	/*@PostMapping
	public String validateConn(Model model)
	{
		String res = "";
		
		try
		{
			Timer timer = new Timer();
			
			Socket clientSocket = new Socket("192.168.0.108", 9100);
			
			clientSocket.setSoTimeout(3000); // Establecer Tiempo para desconectar el Socket de manera automática
			
			if (clientSocket.isConnected()) {
				res = "Conexión Establecida";
			}
			else {
				res = "Ocurrió un error al conectar";
			}
			
			clientSocket.close();
			
		}
		catch(SocketException ex) {
			res += ex.getMessage();
		}
		catch(Exception ex)
		{
			res += ex.getMessage();
		}
		
		model.addAttribute("resultado", res);
		
		return "zebra/index";
	}*/
	
	/*@PostMapping
	public String labelPrint(Model model)
	{
		String resultado;
		
		ZebraLabel zebraLabel = new ZebraLabel(400, 500);
		zebraLabel.setDefaultZebraFont(ZebraFont.ZEBRA_ZERO);

		zebraLabel.addElement(new ZebraText(10, 84, "Product:", 14));
		zebraLabel.addElement(new ZebraText(395, 85, "Camera", 14));

		zebraLabel.addElement(new ZebraText(10, 161, "CA201212AA", 14));
		
		//Add Code Bar 39
		zebraLabel.addElement(new ZebraBarCode39(10, 297, "CA201212AA", 118, 2, 2));

		zebraLabel.addElement(new ZebraText(10, 365, "Qté:", 11));
		zebraLabel.addElement(new ZebraText(180, 365, "3", 11));
		zebraLabel.addElement(new ZebraText(317, 365, "QA", 11));

		zebraLabel.addElement(new ZebraText(10, 520, "Ref log:", 11));
		zebraLabel.addElement(new ZebraText(180, 520, "0035", 11));
		zebraLabel.addElement(new ZebraText(10, 596, "Ref client:", 11));
		zebraLabel.addElement(new ZebraText(180, 599, "1234", 11));
		
		zebraLabel.getZplCode();

		try {
			ZebraUtils.printZpl(zebraLabel, "192.168.0.108", 9100);
			resultado = "Etiqueta Impresa";
		} catch (ZebraPrintException e) {
			resultado = e.getMessage();
		}
		
		model.addAttribute("resultado", resultado);
		return "zebra/index";
	}*/
	
	@PostMapping
	public String etiquetaFinal()
	{
		
		return "zebra/index";
	}
}
