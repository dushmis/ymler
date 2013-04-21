package com.dushyant.test;

import java.util.ArrayList;
import java.util.UUID;

import com.dushyant.xml.Age;
import com.dushyant.xml.Function;
import com.dushyant.xml.Project;
import com.dushyant.xml.Projects;
import com.dushyant.yml.YmlException;
import com.dushyant.yml.Ymler;

/**
 * The Class Test.
 */
public class Test {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		try {
			Projects projects = new Projects();

			projects.setProjectList(new ArrayList<Project>() {
				private static final long serialVersionUID = 1L;
				{
					add(new Project() {
						private static final long serialVersionUID = 1L;
						{
							setDate(u());
							setDocumentLocation(u());
							setFunctions(new ArrayList<Function>() {
								private static final long serialVersionUID = 1L;
								{
									add(new Function(u(), u(), u()));
								}
							});
							setName(u());
						}
					});
				}
			});
			System.out.println(projects.hashCode());
			Ymler<Projects> ymler = new Ymler<Projects>();
			ymler.save(projects);
			Projects projects2 = ymler.get(Projects.class);
			System.out.println(projects2.hashCode());

			// final Projects projects2 = baseYml.get(Projects.class);
			// System.out.println("-11111111111" + projects2);
		} catch (YmlException e) {
			e.printStackTrace();
		}

	}

	/**
	 * U.
	 * 
	 * @return the string
	 */
	private static String u() {
		return UUID.randomUUID().toString();
	}
}
