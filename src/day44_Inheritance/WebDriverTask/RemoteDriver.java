package day44_Inheritance.WebDriverTask;

public class RemoteDriver {

    public String name, version;

    public RemoteDriver(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void get(String URL){
        System.out.println("opening the default Remote driver");
    }

    public void close(){
        System.out.println("closing the Remote driver ");
    }

    @Override
    public String toString() {
        return "RemoteDriver{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}

/*
1. create a class called RemoteWebDriver
			name, version

			add a constructor to set the instances

			get(URL), maximize(), close()
 */