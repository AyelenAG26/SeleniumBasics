package EjerciciosSelenium;

import org.testng.annotations.*;

public class Anotations {

    //proporciona una cantitdad de datos llamados datos login
    @DataProvider(name = "datosLogin")
    public Object[][] datosParaLogin(){
        //regresa un arreglo de objetos con esos datos
        return new Object[][]{
                //declaraciond de datos
                {"usuario1","contra1"},
                {"usuario2","contra2"},
                {"usuario3","contra3"}
        };
    }

    @Test(dataProvider = "datosLogin")
    public void loginTest(String usuario, String password){
        System.out.println("Probar usuario: "+usuario+" y el password: "+password);
    }

    @BeforeSuite //al inicio de las pruebas
    public void prepararLaCocina(){
        System.out.println("Preparamos la cocina para cocinar");
    }
    //despues de las pruebas
    @AfterSuite
    public void limpioLaCocina(){
        System.out.println("Termine de cocinar voy a limpiar");
    }
    //antes de las clases, solo se realiza una vez
    @BeforeClass
    public void encenderHosrno(){
        System.out.println("Prendemos y calentamos el horno");
    }
    //despues de la clase y pruebas
    @AfterClass
    public void ApagarHorno(){
        System.out.println("Apagamos el horno");
    }
    //antes de cada prueba
    @BeforeMethod
    public void lavarseManos(){
        System.out.println("Me lavo las manos");
    }
    //despues de cada prueba
    @AfterMethod
    public void lavarPlatos(){
        System.out.println("Lavando platos");
    }
    @Test (priority = 2, groups = {"smoke"})
    public void hacerPastel(){
        System.out.println("Hagamos un pastel");
    }
    @Test (priority = 1, enabled = false)
    public void hacerPizza(){
        System.out.println("Hagamos un pizza");
    }



}

