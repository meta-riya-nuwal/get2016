package social;

import java.util.*;

/*
 * It sets the user's complete profile
 */
public class Profile {

	Scanner sc = new Scanner(System.in);
	ReadFile f = new ReadFile();
	String name, gender, place;
	int id, age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	Profile getProfile(String name) {
		Profile p[] = f.ContentToObject();
		Profile p1 = new Profile();
		int f = 0;
		while (true) {
			for (int i = 0; i < p.length; i++) {
				if (p[i].getName().equals(name)) {
					f = 1;
					p1 = p[i];
					return p1;
				}
			}
			if (f == 0) {

				System.out.print("This user is not avilable enter another");
				name = sc.next();
			}
		}

	}
}
