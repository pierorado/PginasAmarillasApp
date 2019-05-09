package com.rado.piero.pginasamarillasapp.Repositories;

import com.rado.piero.pginasamarillasapp.Models.Company;

import java.util.ArrayList;
import java.util.List;

public class CompanyRepository {
    private static List<Company> companies=new ArrayList<>();
    static {
        companies.add(new Company(100,"restaurante","La casa del tacutacu","Jr.pelotillehe",987425231,"informes@lacasadeltacu.com","www.lacadeltacutacu.com","ic_company1","Dejese cautivar por el mejor sabor criollo.."));
        companies.add(new Company(200,"Polleria","Leña y Carbon","Jr.aventura",977425231,"informes@leñaycarbon.com","www.leñaycarbon.com","ic_company2","Dejese cautivar por el mejor sabor de pollo.."));
        companies.add(new Company(300,"Supermercado","Rositos","Jr.manzaneros",967425231,"informes@rositos.com","www.rositos.com","ic_company3","Dejese cautivar por rositos.."));
        companies.add(new Company(400,"Tienda","Doritos","Jr.benjamin",927465231,"informes@doritos.com","www.doritos.com","ic_company4","Dejese cautivar con la atencion.."));
        companies.add(new Company(500,"Pizzas","Zic Zac","Jr.portada",98855231,"informes@ziczac.com","www.ziczac.com","ic_company5","Dejese cautivar por el mejor sabor de pizza.."));
        companies.add(new Company(600,"Chaufa","El chino","Jr.olimpo",997546231,"informes@elchino.com","www.elchino.com","ic_company6","Dejese cautivar por el mejor sabor chino.."));
        companies.add(new Company(100,"restaurante","La casa del tacutacu","Jr.pelotillehe",987425231,"informes@lacasadeltacu.com","www.lacadeltacutacu.com","ic_company1","Dejese cautivar por el mejor sabor criollo.."));
        companies.add(new Company(200,"Polleria","Leña y Carbon","Jr.aventura",977425231,"informes@leñaycarbon.com","www.leñaycarbon.com","ic_company2","Dejese cautivar por el mejor sabor de pollo.."));
        companies.add(new Company(300,"Supermercado","Rositos","Jr.manzaneros",967425231,"informes@rositos.com","www.rositos.com","ic_company3","Dejese cautivar por rositos.."));
        companies.add(new Company(400,"Tienda","Doritos","Jr.benjamin",927465231,"informes@doritos.com","www.doritos.com","ic_company4","Dejese cautivar con la atencion.."));
    }
    public static List<Company> getCompanies() {return companies;}

    public  static Company getCompanyById(Integer id) {
        for (Company company:companies){
            if (company.getId().equals(id)) {
                return company;
            }
        }
        return null;
    }
}
