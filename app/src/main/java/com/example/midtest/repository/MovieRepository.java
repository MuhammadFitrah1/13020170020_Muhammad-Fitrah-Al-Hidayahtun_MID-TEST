package com.example.midtest.repository;

import com.example.midtest.model.CastAndCrew;
import com.example.midtest.model.Movies;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    private static MovieRepository instance;
    private List<Movies> list = new ArrayList<>();

    public static MovieRepository getInstance(){
        if (instance == null){
            instance = new MovieRepository();
        }

        return instance;
    }

    public List<CastAndCrew> MarvelsAgentsofSHIELD2013(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/mq686D91XoZpqkzELn0888NOiZW.jpg", "Clark Gregg"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ba61bJ4RohH7Ks80xSUGZ1HtKF1.jpg", "Chloe Bennet"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/kZragNGDCYOTcf9I9gnnDXw35Mr.jpg", "Iain De Caestecker"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ohoSW1kYL3GMlFgGWuLEC1IzjmE.jpg", "Elizabeth Henstridge"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/tetrTHW9QZoQRiuzPQa5JETQCJv.jpg", "Brett Dalton"));
        return al;
    }

    public List<CastAndCrew> The100_2014(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/igWylWFncQPoJZcmwRsACUYXtyQ.jpg", "Eliza Taylor"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/2cmGyuIhI8pGe1W3mGXK1RtQIeK.jpg", "Bob Morley"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/m5vWJx7LCiJ1ZBoAYJBqKrK4khL.jpg", "Marie Avgeropoulos"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/azTNRQ6VsxWNCwwvbPQu2JRvVCA.jpg", "Lindsey Morgan"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/kYc2nCBBU9pHNDMDopk6WIVXZg6.jpg", "Richard Harmon"));
        return al;
    }

    public List<CastAndCrew> Snowpiercer2020(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/mOVleZFCqMDugAXyyiJBq6LmSah.jpg", "Jennifer Connelly"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/codalhZzB4LvJTSGOnOyrTEsqsF.jpg", "Daveed Diggs"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/gNxtYfg8xXgeQ4YC7Pl3HNRAjol.jpg", "Mickey Sumner"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/lwetyIzRTIOvxdHecVxyZIoRBAT.jpg", "Susan Park"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/9PKwxJfYOgxAkZurTTY17EdIPGY.jpg", "Benjamin Haigh"));
        return al;
    }

    public List<CastAndCrew> Pokemon1997(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/zFOhkOTby060i4pxpCRKR53SuLT.jpg", "Ikue Otani"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jSQPB45PbMYmSFGnlX9nGM9DRr4.jpg", "Unsho Ishizuka"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/btCUFtJEE7RefoguctvvfQjxIcd.jpg", "Megumi Hayashibara"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/21KJlWbE6qAQA7cTwbeCPSuaALI.jpg", "Shin-ichiro Miki"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/leCRUplJe0J5VIAWwXK3eNORyK1.jpg", "Inuko Inuyama"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/b7gFUNNUPGyrfuvBf8AW4DaziYX.jpg", "Yuji Ueda"));
        return al;
    }

    public List<CastAndCrew> AmericanDad2005(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/rcxgL68bm4PQkiWDhHJWaGDzKkU.jpg", "Seth MacFarlane"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/oxdX8TxHGY3s1Kw6t7UYCZF7sy2.jpg", "Wendy Schaal"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/7LOWBMiRsSVm8iLj3mklQc6v7Jy.jpg", "Scott Grimes"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/fpGmSNSkwTaixEGAwC14A88JYAH.jpg", "Dee Bradley Baker"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/psCxFYdotzPkLEVxSfLReQ6jql6.jpg", "Curtis Armstrong"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/wEy5qSDT5jT3ZASc2hbwi59voPL.jpg", "Patrick Stewart"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/glUDeCvXfoLXgE0JJ5CboDpFW4R.jpg", "Eddie Kaye Thomas"));
        return al;
    }

    public List<CastAndCrew> Blindspot2015(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/21IQHPAXNUHiqPrpIYr4X8h2wmf.jpg", "Jaimie Alexander"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/zT25J9Jtbhkimul2KSeCZZulIPU.jpg", "Sullivan Stapleton"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/8s36QwB7Zq3PrbY1W6a6ctTFFoe.jpg", "Ashley Johnson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jVevsp9OsdImQ8YxNjdG3KLYket.jpg", "Rob Brown"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iJlTZ2ZoEwhfzD52FI9G5YYrqSj.jpg", "Ukweli Roach"));
        return al;
    }

    public List<CastAndCrew> Billions2016(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/kn7LAbFYP5RPC2r61tDx2CRUeuw.jpg", "Paul Giamatti"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/qm4M15FTUmuf1j8Kp3M7p0LaqC2.jpg", "Damian Lewis"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ufiWZMq4z5yra0At3NlYvyZ72ws.jpg", "Maggie Siff"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jTouM1QK24TXy5Q3T40t4AhR8GH.jpg", "David Costabile"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/tRG8AEfQczExg4cjLMfMdWKxUaq.jpg", "Condola Rashad"));
        return al;
    }

    public List<CastAndCrew> ReasonsWhy2017(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/fmRHI0ovny7lk27TzejA47or802.jpg", "Dylan Minnette"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/rYl9pJbIONDUtJBO1skQULDfUz1.jpg", "Christian Navarro"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/d97PBeHPYIJ4hshqoe2ahRJ2NIq.jpg", "Alisha Boe"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/qf07V6vbPakEPQhvL02ysweud2h.jpg", "Brandon Flynn"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/htDqfuPQBcI3VhHhlTKUtv9vSbp.jpg", "Miles Heizer"));
        return al;
    }

    public List<CastAndCrew> SesameStreet1969(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/1UwC8NyPIMZJE6axuw2qAMdZdzr.jpg", "Frank Oz"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/yZ5EdQQvjifJ0hLh8CU7Ug7kz1e.jpg", "Kevin Clash"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/tBJDwH008IVSeTCB5e2P856NbIv.jpg", "Dave Goelz"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bB4DRQwKUswG8uvFmDDHHWFwzlz.jpg", "Eric Jacobson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/mb5iH36utDBZr0ZtdspIwXQP1De.jpg", "Jim Henson"));
        return al;
    }

    public List<CastAndCrew> DCsLegendsofTomorrow2016(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/8qoclLocP4uCltlC0gGrQCG2CHc.jpg", "Caity Lotz"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/30giDZ53c8f72pPbXCLK9xMSAnw.jpg", "Dominic Purcell"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/7QjOM1aRmje6eusghGY4blnBaAO.jpg", "my Pemberton"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/uGPbPxlKAkbbUVq2sxuvkZpdThl.jpg", "Brandon Routh"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/t47PZJOUehQV4RFOEXoszMiOEjx.jpg", "Nick Zano"));
        return al;
    }

    public List<CastAndCrew> WWERaw1993(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/8z3phpCCuvec1JKcNRuQtkbZ4j0.jpg", "John Cena"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/zSrgS4VPx5f12iZC9zxiULartDj.jpg", "Paul Michael Lévesque"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/baaxOExNJqoAU5PZRBLWi25Ennx.jpg", "Jerry Lawler"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/1vNbHy35sXO3RPZLw29ATOdE7yJ.jpg", "Randy Orton"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/cTMSEW9vOSMsugwE2XXtJ1L2zfM.jpg", "Owen James Hart"));
        return al;
    }

    public List<CastAndCrew> Tosh02009(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/aASspFxmXPNrBSbD8MXBNdO4064.jpg", "Perez Hilton"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ecXKtxy3tVTndFySQQUv0P03oj0.jpg", "Andy Dick"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/qM5oxuEXGgHoPpiy1dKkNdxgbOX.jpg", "Dave Attell"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/niVyGVkmmUDYHydgADuuBjJRXzR.jpg", "Fred Willard"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/fpTTe1ow3EdfRJ8PZgBJmpeghMS.jpg", "David Koechner"));
        return al;
    }

    public List<CastAndCrew> Stargirl2020(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/ggGaeipC6rPreZFPjqIeVZs5ZlX.jpg", "Brec Bassinger"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/nCPx1kKKsGDzgpYZRG14hbnfFv.jpg", "Meg DeLacy"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/GTx8OEQoj0GWVwSjxRCgWtzP6n.jpg", "Luke Wilson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/noDadb44ECVzWFMgq8fkXcFO023.jpg", "Amy Smart"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/AtoOOi6QQ8lnSScVCkGBfcGb14u.jpg", "Hunter Sansone"));
        return al;
    }

    public List<CastAndCrew> Casualty1986(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bd331R15326f3fvpANMspQvKnTy.jpg", "Derek Thompson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/1S79azUSOqifth7pZCsQXF5Mq3I.jpg", "Ian Bleasdale"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/znENHgRFUUfx3gsTOSPwGMZ5Lhg.jpg", "Tony Marshall"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/rlNnpXapxZTw3LkNcqqdbJUki2Y.jpg", "Simon MacCorkindale"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/orfgdl8usvF1PrYHHK4ZxaXo78Z.jpg", "James Redmond"));
        return al;
    }

    public List<CastAndCrew> WWENXT2010(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/uVnrG3L9IR94FhGMD2dZk3frZXb.jpg", "Thomas Hannifan"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/nfxETymHn63dorPqFvER4TbxSCR.jpg", "Darren Matthews"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/sPoL1Gkr1rAR2G3pjs5uoiQzDx2.jpg", "Nick McNeil"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iqx73M6UHUueL92G13pW2a3ohEW.jpg", "Pamela Rose Martinez"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/gukThKgEqK3bE7Op5cVM8YxzDus.jpg", "Eddie Orengo"));
        return al;
    }

    public List<CastAndCrew> PennyDreadfulCityofAngels2020(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/3OlkHjDKDj9NKkFWXfLk7gcb2C.jpg", "Natalie Dormer"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/6B9hny2s7frxtbRqrHqOT7ESB4A.jpg", "Daniel Zovatto"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/2bUBBFrTgHxAhLS5OxutSrrTPja.jpg", "Kerry Bishé"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/1aE7wu22bdgVTa0PMKXbAOSLiZn.jpg", "Adriana Barraza"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/7wz2LJq4VY9W0FAstCtRfZvjYel.jpg", "Jessica Garza"));
        return al;
    }

    public List<CastAndCrew> AmericasGotTalent2006(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/My1ntuj7FdrO1rnJW4FKGesRRp.jpg", "Simon Cowell"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/yqnHDPtu3gFdnVmE9YmyEG5IaPM.jpg", "Howie Mandel"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/w0475CrtBvSva3p1qsIePoBXQ5g.jpg", "Nick Cannon"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/UZiPxAUSkXJsXaHTJDnlW9lqnX.jpg", "Heidi Klum"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/y3C5u4enbi5n3GInsf1EN5tO9xy.jpg", "Mel B"));
        return al;
    }

    public List<CastAndCrew> VisaVisElOasis2020(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/uBMSiIXu3Vu1xGr9bB1i8u29OxD.jpg", "Claudia Riera"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/abtq5qBTw0NTtZY0EUNk9HNOiGm.jpg", "Lisi Linder"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/8Fudl4iBDPb7koExXu6gxNShbUc.jpg", "Lucas Ferraro"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/1nrQYbMrJxgmt70e96C9MzEsMzj.jpg", "Ramiro Blas"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iK16sFA1LV3k13EhCm11R2J0vOC.jpg", "Daniel Ortiz"));
        return al;
    }

    public List<CastAndCrew> CentralPark2020(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/bgRWcrD9hfaa2f7RUWJzxmJaWuD.jpg", "Josh Gad"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/492E9YGjWOr1g6udOvX3g5fGS5Q.jpg", "Leslie Odom Jr."));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/u4m7dd4n883KRAHzGTPZw8qSoML.jpg", "Kristen Bell"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/aSgNPpLPp8Ou1X6qHdSP6Sq7Gju.jpg", "Tituss Burgess"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/codalhZzB4LvJTSGOnOyrTEsqsF.jpg", "Daveed Diggs"));

        return al;
    }

    public List<CastAndCrew> QI2003(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/5eiXSaR1vW6mDYSr2Jcyf5h1xvg.jpg", "Alan Davies"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xeheTDmmQDFYaKxEHmyxbjrte4G.jpg", "Stephen Fry"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/eEFOhsUQoBQARmid9PsxF9CoPSd.jpg", "Phill Jupitus"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hA3vK90snmnt1xtuJR4Iac0YRXe.jpg", "Bill Bailey"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/2iM97jO52enXCk9HWrvrCZjn0ek.jpg", "Jo Brand"));
        return al;
    }

    public List<Movies> getData(){
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/gHUCCMy1vvj58tzE3dZqeC9SXus.jpg","Marvel's Agents of S.H.I.E.L.D. (2013)","Agent Phil Coulson of S.H.I.E.L.D. (Strategic Homeland Intervention, Enforcement and Logistics Division) puts together a team of agents to investigate the new, the strange and the unknown around the globe, protecting the ordinary from the extraordinary.", "TV-14, Drama, Sci-Fi & Fantasy, Action & Adventure","43m","Joss Whedon","2013", MarvelsAgentsofSHIELD2013()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/n6UNHZoiYj81abwmG38HbNjflDx.jpg","Snowpiercer (2020)","Set more than seven years after the world has become a frozen wasteland, the remnants of humanity inhabit a gigantic, perpetually-moving train that circles the globe as class warfare, social injustice and the politics of survival play out.","TV-MA, Sci-Fi & Fantasy","50m","Graeme Manson","2020", Snowpiercer2020()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/tbEyK30YTMwPXphpontGEBrK21u.jpg","Pokémon (1997)","Join Ash Ketchum, accompanied by his partner Pikachu, as he travels through many regions, meets new friends and faces new challenges on his quest to become a Pokémon Master.","TV-Y7, Animation, Action & Adventure, Sci-Fi & Fantasy","22m","Satoshi Tajiri","1997", Pokemon1997()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/1aklTBd36LFiFNroOSiherLvLdu.jpg","American Dad! (2005)","The series focuses on an eccentric motley crew that is the Smith family and their three housemates: Father, husband, and breadwinner Stan Smith; his better half housewife, Francine Smith; their college-aged daughter, Hayley Smith; and their high-school-aged son, Steve Smith. Outside of the Smith family, there are three additional main characters, including Hayley's boyfriend turned husband, Jeff Fischer; the family's man-in-a-goldfish-body pet, Klaus; and most notably the family's zany alien, Roger, who is \"full of masquerades, brazenness, and shocking antics.","TV-14, Animation, Comedy","22m","Seth MacFarlane","2005", AmericanDad2005()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/iAkEexatzMUlCXlbS8Gmvlic9gQ.jpg","Blindspot (2015)","A vast international plot explodes when a beautiful Jane Doe is discovered naked in Times Square, completely covered in mysterious, intricate tattoos with no memory of who she is or how she got there. But there's one tattoo that is impossible to miss: the name of FBI agent Kurt Weller, emblazoned across her back. \"Jane,\" Agent Weller and the rest of the FBI quickly realize that each mark on her body is a crime to solve, leading them closer to the truth about her identity and the mysteries to be revealed.","TV-14, Action, Crime, Drama","43m","Martin Gero","2015", Blindspot2015()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/lbIMe94gXNGBzlFACqbrUyEXpyN.jpg","Billions (2016)","Shrewd, savvy U.S. Attorney Chuck Rhoades and the brilliant, ambitious hedge fund king Bobby \"Axe\" Axelrod are on an explosive collision course, with each using all of his considerable smarts, power and influence to outmaneuver the other. The stakes are in the billions in this timely, provocative series.","TV-MA, Drama","1h","Brian Koppelman","2016", Billions2016()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/nel144y4dIOdFFid6twN5mAX9Yd.jpg","13 Reasons Why (2017)","After a teenage girl's perplexing suicide, a classmate receives a series of tapes that unravel the mystery of her tragic choice.","TV-MA, Drama, Mystery","57m","Brian Yorkey","2017", ReasonsWhy2017()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xNWfDneXNj4EJjqFR1gFbM3wbnc.jpg","Sesame Street (1969)","On a special inner city street, the inhabitants—human and muppet—teach preschoolers basic educational and social concepts using comedy, cartoons, games, and songs.","TV-Y, Animation, Comedy, Family","54m","Joan Ganz Cooney","1969", SesameStreet1969()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/9HWjGTh1NkfRq8ocjenZ0VfAcPc.jpg","WWE Raw (1993)","WWE Raw is a professional wrestling television program that currently airs live on Monday evenings on the USA Network in the United States. The show debuted on January 11, 1993. WWE Raw moved from the USA Network to TNN in September, 2000 and then to Spike TV in August, 2003 when TNN was rebranded. On October 3, 2005 WWE Raw returned to the USA Network.\n" +
                "\n" +
                "Since its first episode, WWE Raw has broadcast live from 203 different arenas in 169 cities and towns in ten different nations. As of the show's 1,000th episode, airing on July 23, 2012, WWE Raw has become a three-hour broadcast from two-hours, a format that had previously been reserved for special episodes.","TV-PG, Reality","2h 10m","Vince McMahon","1993", WWERaw1993()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/yJ3xE11IDIe29LJsSbhzwt5Oxtd.jpg","DC's Legends of Tomorrow (2016)","When heroes alone are not enough ... the world needs legends. Having seen the future, one he will desperately try to prevent from happening, time-traveling rogue Rip Hunter is tasked with assembling a disparate group of both heroes and villains to confront an unstoppable threat — one in which not only is the planet at stake, but all of time itself. Can this ragtag team defeat an immortal threat unlike anything they have ever known?","TV-14, Action & Adventure, Drama, Sci-Fi & Fantasy","42m","Greg Berlanti","2016", DCsLegendsofTomorrow2016()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/wcaDIAG1QdXQLRaj4vC1EFdBT2.jpg","The 100 (2014)","100 years in the future, when the Earth has been abandoned due to radioactivity, the last surviving humans live on an ark orbiting the planet — but the ark won't last forever. So the repressive regime picks 100 expendable juvenile delinquents to send down to Earth to see if the planet is still habitable.","TV-14, Sci-Fi & Fantasy, Drama, Action & Adventure","43m","Jason Rothenberg","2014", The100_2014()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/6PLXAci8bZCtzDzqzgfpffWfaHe.jpg","Tosh.0 (2009)","A weekly topical series hosted by comedian Daniel Tosh that delves into all aspects of the Internet, from the ingenious to the absurd to the medically inadvisable.","Comedy","30m","Mike Gibbons","2009", Tosh02009()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/sWSGc3Bb7aCTOPvAIkkhqI7ae9H.jpg","Stargirl (2020)","Courtney Whitmore, a smart, athletic and above all else kind girl, discovers her step-father has a secret; he used to be the sidekick to a superhero. \"Borrowing\" the long-lost hero’s cosmic staff, she becomes the unlikely inspiration for an entirely new generation of superheroes.","TV-14, Action & Adventure, Drama, Crime, Sci-Fi & Fantasy","43m","Geoff Johns","2020", Stargirl2020()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xori6j1eOdXwD5z213t2o8NMcvu.jpg","Casualty (1986)","Drama series about the staff and patients at Holby City Hospital's emergency department, charting the ups and downs in their personal and professional lives.","Drama","50m","Jeremy Brock","1986", Casualty1986()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/yh6cpWfIaiNbZDlqTjjzv7OSooV.jpg","WWE NXT (2010)","Wrestlers will portray heroes or villains as they follow a series of events that build tension and culminate in a wrestling match or series of matches.","TV-PG, Action & Adventure, Drama","2h","Paul Michael Lévesque","2010", WWENXT2010()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/w8lrENZZBMHTUpXNUlxt81Ks7G2.jpg","Penny Dreadful: City of Angels (2020)","Rooted in the conflict between characters connected to the deity Santa Muerte and others allied with the Devil, this saga explores an exciting mix of the supernatural and the combustible reality of 1938 Los Angeles, a time and place deeply infused with Mexican-American folklore and social tension.","TV-MA, Drama, Crime, Mystery","1h","John Logan","2020", PennyDreadfulCityofAngels2020()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/pmL3KI6ROdc9fkjHabqWlBnSUGf.jpg","America's Got Talent (2006)","A weekly talent competition where an array of performers – from singers and dancers, to comedians and novelty acts – vie for a $1 million cash prize.","Reality","1h 25m","Ken Warwick","2006", AmericasGotTalent2006()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/7EOWkNGxXq2MBZxfV3ZxjRM4vlH.jpg","Vis a Vis: El Oasis (2020)","After a few years dedicating themselves to robbing jewelers, banks and casinos, it is time for Macarena and Zulema to separate.","Drama","50m","Iván Escobar","2020", VisaVisElOasis2020()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/53FsUraZrtABetxCl1HkFo16gOD.jpg","Central Park (2020)","An animated musical comedy about the Tillermans, a family that lives in a castle in Central Park. Owen, the park manager, and Paige, his journalist wife, raise their kids Molly and Cole in the world’s most famous park, while fending off a hotel heiress, Bitsy Brandenham, who would love nothing more than to turn the park into condos.","TV-14, Animation, Comedy","25m","Josh Gad","2020", CentralPark2020()));
        list.add(new Movies("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hieAAv1MVYzRuX12ttVmlq7kGn9.jpg","QI (2003)","Comedy quiz show full of quirky facts, in which contestants are rewarded more if their answers are 'quite interesting'.","Comedy, Talk","30m","John Lloyd","2003", QI2003()));
        return list;
    }

    public void removeIndex(int index){
        list.remove(index);
    }

    public void clearData(){
        list.clear();
    }

}
