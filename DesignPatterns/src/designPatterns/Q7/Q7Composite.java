package designPatterns.Q7;

public class Q7Composite {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Reshma","Java");
        Developer developer2 = new Developer("Pooja","C#");

        Manager manager1 = new Manager("Mahima","Associate");
        Manager manager2 = new Manager("Anushka","Senior");

        DeveloperDirectory developerDirectory= new DeveloperDirectory();
        developerDirectory.developerDirectory.add(developer1);
        developerDirectory.developerDirectory.add(developer2);

        ManagerDirectory managerDirectory = new ManagerDirectory();
        managerDirectory.managerDirectory.add(manager1);
        managerDirectory.managerDirectory.add(manager2);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.companyDirectory.add(developerDirectory);
        companyDirectory.companyDirectory.add(managerDirectory);

        companyDirectory.showDirectoryDetails();
    }
}
