package Inclass7;

import Inclass7.Person.Sex;

public interface CheckPerson {
	public boolean test(Person p);
//	public boolean test(Person p) {
//		if (p.gender == Person.Sex.MALE && (p.getAge() >= 18 && p.getAge() < 25)) {
//			return true;
//		}
//		return false;
//	}
}

class CheckPersonEligibleForSelectiveService implements CheckPerson {
	@Override
	public boolean test(Person p) {
		return p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
	}
}
