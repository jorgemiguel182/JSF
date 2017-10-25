package br.com.project.geral.controller;

import java.util.HashMap;

import javax.faces.bean.ApplicationScoped;
import javax.servlet.http.HttpSession;

@ApplicationScoped
public class SessionControllerImpl implements SessionController {

	private static final long serialVersionUID = 1L;

	private HashMap<String, HttpSession> hashmap = new HashMap<String, HttpSession>();
	
	@Override
	public void addSession(String keyLoginUser, HttpSession httpSession) {
		hashmap.put(keyLoginUser, httpSession);
	}

	@Override
	public void invalidateSession(String keyLoginUser) {
		HttpSession session = hashmap.get(keyLoginUser);
		if(session != null){// remove sessao do usuário passad como parametro
			try {
				session.invalidate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			System.out.println("não tem usuario");
		}
		hashmap.remove(keyLoginUser);
	}

}
