import somepackage.Other;
import somepackage.Some;

public class Test {
    public static void main(String[] args) {

        Other.saySomthing();
        Other other = new Other();

        Some some = new Some("Как это делать?");
        System.out.println(some.getSecret());
        System.out.println(some.getДаТакТожеМожно());
        System.out.println(some.getNoMoreSecrets());
        System.out.println(some.getSecret() + " " + some.getNoMoreSecrets());
        some.setNoMoreSecrets(1234);
        System.out.println(some.getNoMoreSecrets());
        some.setNoMoreSecrets(213412);
        some.getSecret(true);
        System.out.println(some.getSecret());
        System.out.println(some.toString());
        System.out.println(some.count());
        System.out.println(some.getSecret() + " " + some.count());
        some.soTellMeAboutInterfaces();
        System.out.println(some.equals(some));
        System.out.println(some.hashCode());
        System.out.println(some.equals(other));
        System.out.println(other.hashCode());
        System.out.println(other.hashCode() == some.hashCode());
    }
}
