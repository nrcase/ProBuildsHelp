
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;


public class LoLProbuilds
{

    public static void main(String[] args) throws IOException {

        Scanner userInput = new Scanner(System.in);

        String champ = "";
        int champNum = 0;

        System.out.println("What Champion are you playing? (Full Name except for Blitz, Cait, Cass, A Sol, Mundo, Eve, Fiddle, Heimer, Kat, LeBlanc, Malz, Mord, Nid, TK, Trynd, TF, Vlad, and Xin)");
        champ = userInput.nextLine();

        switch (champ.toLowerCase().trim())
        {
            case "aatrox" : champNum =  266; break;
            case "ahri" : champNum = 103; break;
            case "akali" : champNum = 84; break;
            case "alistar" : champNum = 12; break;
            case "amumu" : champNum = 32; break;
            case "anivia" : champNum = 34; break;
            case "annie" : champNum = 1; break;
            case "aphelios" : champNum = 523; break;
            case "ashe" : champNum = 22; break;
            case "a sol" : champNum = 136; break;
            case "azir" : champNum = 268; break;
            case "bard" : champNum = 432; break;
            case "blitz" : champNum = 53; break;
            case "brand" : champNum = 63; break;
            case "braum" : champNum = 201; break;
            case "cait" : champNum = 51; break;
            case "camille" : champNum = 164; break;
            case "cass" : champNum = 69; break;
            case "cho'gath" : champNum = 31; break;
            case "corki" : champNum = 42; break;
            case "darius" : champNum = 122; break;
            case "diana" : champNum = 131; break;
            case "mundo" : champNum = 36; break;
            case "draven" : champNum = 119; break;
            case "ekko" : champNum = 245; break;
            case "elise" : champNum = 60; break;
            case "eve" : champNum = 28; break;
            case "ezreal" : champNum = 81; break;
            case "fiddle" : champNum = 9; break;
            case "fiora" : champNum = 114; break;
            case "fizz" : champNum = 105; break;
            case "galio" : champNum = 3; break;
            case "gangplank" : champNum = 41; break;
            case "garen" : champNum = 86; break;
            case "gnar" : champNum = 150; break;
            case "gragas" : champNum = 79; break;
            case "graves" : champNum = 104; break;
            case "hecarim" : champNum = 120; break;
            case "heimer" : champNum = 74; break;
            case "illaoi" : champNum = 420; break;
            case "irelia" : champNum = 39; break;
            case "ivern" : champNum = 427; break;
            case "janna" : champNum = 40; break;
            case "jarvan" : champNum = 59; break;
            case "jax" : champNum = 24; break;
            case "jayce" : champNum = 126; break;
            case "jhin" : champNum = 202; break;
            case "jinx" : champNum = 222; break;
            case "kai'sa" : champNum = 145; break;
            case "kalista" : champNum = 429; break;
            case "karma" : champNum = 43; break;
            case "karthus" : champNum = 30; break;
            case "kassadin" : champNum = 38; break;
            case "kat" : champNum = 55; break;
            case "kayle" : champNum = 10; break;
            case "kayne" : champNum = 141; break;
            case "kennen" : champNum = 85; break;
            case "kha'zix" : champNum = 121; break;
            case "kindred" : champNum = 203; break;
            case "kled" : champNum = 240; break;
            case "kog'maw" : champNum = 96; break;
            case "leblanc": champNum = 7; break;
            case "lee sin" : champNum = 64; break;
            case "leona" : champNum = 89; break;
            case "lissandra" : champNum = 127; break;
            case "lucian" : champNum = 236; break;
            case "lulu" : champNum = 117; break;
            case "lux" : champNum = 99; break;
            case "malphite" : champNum = 54; break;
            case "malz" : champNum = 90; break;
            case "maokai" : champNum = 57; break;
            case "master yi" : champNum = 11; break;
            case "miss fortune" : champNum = 21; break;
            case "mord" : champNum = 82; break;
            case "morgana" : champNum = 25; break;
            case "nami" : champNum = 267; break;
            case "nasus" : champNum = 75; break;
            case "nautilus" : champNum = 111; break;
            case "neeko" : champNum = 518; break;
            case "nid" : champNum = 76; break;
            case "nocturne" : champNum = 56; break;
            case "nunu" : champNum = 20; break;
            case "olaf" : champNum = 2; break;
            case "orianna" : champNum = 61; break;
            case "ornn" : champNum = 516; break;
            case "pantheon" : champNum = 80; break;
            case "poppy" : champNum = 78; break;
            case "pyke" : champNum = 555; break;
            case "qiyana" : champNum = 246; break;
            case "quinn" : champNum = 133; break;
            case "rakan" : champNum = 497; break;
            case "rammus" : champNum = 33; break;
            case "rek'sai" : champNum = 421; break;
            case "renekton" : champNum = 58; break;
            case "rengar" : champNum = 107; break;
            case "riven" : champNum = 92; break;
            case "rumble" : champNum = 68; break;
            case "ryze" : champNum = 13; break;
            case "sejuani" : champNum = 113; break;
            case "senna" : champNum = 235; break;
            case "sett" : champNum = 875; break;
            case "shaco" : champNum = 35; break;
            case "shen" : champNum = 98; break;
            case "shyvana" : champNum = 102; break;
            case "singed" : champNum = 27; break;
            case "sion" : champNum = 14; break;
            case "sivir" : champNum = 15; break;
            case "skarner" : champNum = 72; break;
            case "sona" : champNum = 37; break;
            case "soraka" : champNum = 16; break;
            case "swain" : champNum = 50; break;
            case "sylas" : champNum = 517; break;
            case "syndra" : champNum = 164; break;
            case "tk" : champNum = 223; break;
            case "taliyah" : champNum = 163; break;
            case "talon" : champNum = 91; break;
            case "taric" : champNum = 44; break;
            case "teemo" : champNum = 17; break;
            case "thresh" : champNum = 412; break;
            case "tristana" : champNum = 18; break;
            case "trundle" : champNum = 48; break;
            case "trynd" : champNum = 23; break;
            case "tf" : champNum = 4; break;
            case "twitch" : champNum = 4; break;
            case "udyr" : champNum = 77; break;
            case "urgot" : champNum = 6; break;
            case "varus" : champNum = 110; break;
            case "vayne" : champNum = 67; break;
            case "veigar" : champNum = 45; break;
            case "vel'koz" : champNum = 161; break;
            case "vi" : champNum = 254; break;
            case "viktor" : champNum = 112; break;
            case "vladimir" : champNum = 8; break;
            case "volibear" : champNum = 106; break;
            case "warwick" : champNum = 19; break;
            case "wukong" : champNum = 62; break;
            case "xayah" : champNum = 498; break;
            case "xerath" : champNum = 101; break;
            case "xin" : champNum = 5; break;
            case "yasuo" : champNum = 157; break;
            case "yorick" : champNum = 86; break;
            case "yuumi" : champNum = 350; break;
            case "zac" : champNum = 154; break;
            case "zed" : champNum = 238; break;
            case "ziggs": champNum = 115; break;
            case "zilean" : champNum = 26; break;
            case "zoe" : champNum = 142; break;
            case "zyra" : champNum = 143; break;

            default:
                System.out.println("This champion doesn't exist or is spelled wrong, use the search bar in the window");
        }

        String finalUrl = "https://www.probuilds.net/champions/details/" + champNum;
        Desktop.getDesktop().browse(URI.create(finalUrl));



    }
}

