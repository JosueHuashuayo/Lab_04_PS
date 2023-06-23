package com.test_func_max;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMultiply {

    // Tests mulyiply large negative and other numeric types
    @Test
    void Test_large_negative_AND_large_negative() {
        BigInteger a = new BigInteger(
                "-7431684367826587654825492824625872464757483485584584585845478548458454854785858");
        BigInteger b = new BigInteger("-84984981516132130456546548547847857485748485584584585845478548458454854785858");
        assertEquals(a.multiply(b), new BigInteger(
                "631581558633470648787129070961475708253825424788758822340417486931674501907081324105803260064003821525316608760714587436127919703836999425090145927036796164"));
    }

    @Test
    void Test_large_negative_AND_small_negative() {
        BigInteger a = new BigInteger(
                "-7431684367826587654825492824625872464757483485584584585845478548458454854785858");
        BigInteger b = new BigInteger("-54878165");
        assertEquals(a.multiply(b), new BigInteger(
                "407837200965508168708476441436134692389917863706685954358484836286263581165989354990570"));
    }

    @Test
    void Test_large_negative_AND_negative_one() {
        BigInteger a = new BigInteger(
                "-7431684367826587654825492824625872464757483485584584585845478548458454854785858");
        BigInteger b = new BigInteger("-1");
        assertEquals(a.multiply(b),
                new BigInteger("7431684367826587654825492824625872464757483485584584585845478548458454854785858"));
    }

    @Test
    void Test_large_negative_AND_zero() {
        BigInteger a = new BigInteger(
                "-7431684367826587654825492824625872464757483485584584585845478548458454854785858");
        BigInteger b = new BigInteger("0");
        assertEquals(a.multiply(b), new BigInteger("0"));
    }

    @Test
    void Test_large_negative_AND_positive_one() {
        BigInteger a = new BigInteger(
                "-7431684367826587654825492824625872464757483485584584585845478548458454854785858");
        BigInteger b = new BigInteger("1");
        assertEquals(a.multiply(b),
                new BigInteger("-7431684367826587654825492824625872464757483485584584585845478548458454854785858"));
    }

    @Test
    void Test_large_negative_AND_small_positive() {
        BigInteger a = new BigInteger(
                "-7431684367826587654825492824625872464757483485584584585845478548458454854785858");
        BigInteger b = new BigInteger("3850000");
        assertEquals(a.multiply(b), new BigInteger(
                "-28611984816132362471078147374809608989316311419500650655505092411565051190925553300000"));
    }

    @Test
    void Test_large_negative_AND_large_positive() {
        BigInteger a = new BigInteger(
                "-7431684367826587654825492824625872464757483485584584585845478548458454854785858");
        BigInteger b = new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345");
        assertEquals(a.multiply(b), new BigInteger(
                "-73273097141468386926239148623986949861594162233093866326850582784170736058663293415671906247281952369146122972243359250185180197052563804019571345810917010"));
    }

    // Tests mulyiply small negative and other numeric types
    @Test
    void Test_small_negative_AND_large_negative() {
        BigInteger a = new BigInteger("-87245645216");
        BigInteger b = new BigInteger("-84984981516132130456546548547847857485748485584584585845478548458454854785858");
        assertEquals(a.multiply(b), new BigInteger(
                "7414569546044781634390088279194854174547342149521957135416916836545015976199766722155328"));
    }

    @Test
    void Test_small_negative_AND_small_negative() {
        BigInteger a = new BigInteger("-87245645216");
        BigInteger b = new BigInteger("-54878165");
        assertEquals(a.multiply(b), new BigInteger("4787880913695108640"));
    }

    @Test
    void Test_small_negative_AND_negative_one() {
        BigInteger a = new BigInteger("-87245645216");
        BigInteger b = new BigInteger("-1");
        assertEquals(a.multiply(b), new BigInteger("87245645216"));
    }

    @Test
    void Test_small_negative_AND_zero() {
        BigInteger a = new BigInteger("-87245645216");
        BigInteger b = new BigInteger("0");
        assertEquals(a.multiply(b), new BigInteger("0"));
    }

    @Test
    void Test_small_negative_AND_positive_one() {
        BigInteger a = new BigInteger("-87245645216");
        BigInteger b = new BigInteger("1");
        assertEquals(a.multiply(b), new BigInteger("-87245645216"));
    }

    @Test
    void Test_small_negative_AND_small_positive() {
        BigInteger a = new BigInteger("-87245645216");
        BigInteger b = new BigInteger("3850000");
        assertEquals(a.multiply(b), new BigInteger("-335895734081600000"));
    }

    @Test
    void Test_small_negative_AND_large_positive() {
        BigInteger a = new BigInteger("-87245645216");
        BigInteger b = new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345");
        assertEquals(a.multiply(b), new BigInteger(
                "-860203194952375364444402454618042041736742602074006092179454408676111354190554074191520"));
    }

    // Tests mulyiply negative one and other numeric types
    @Test
    void Test_negative_one_AND_large_negative() {
        BigInteger a = new BigInteger("-1");
        BigInteger b = new BigInteger("-84984981516132130456546548547847857485748485584584585845478548458454854785858");
        assertEquals(a.multiply(b),
                new BigInteger("84984981516132130456546548547847857485748485584584585845478548458454854785858"));
    }

    @Test
    void Test_negative_one_AND_small_negative() {
        BigInteger a = new BigInteger("-1");
        BigInteger b = new BigInteger("-54878165");
        assertEquals(a.multiply(b), new BigInteger("54878165"));
    }

    @Test
    void Test_negative_one_AND_negative_one() {
        BigInteger a = new BigInteger("-1");
        BigInteger b = new BigInteger("-1");
        assertEquals(a.multiply(b), new BigInteger("1"));
    }

    @Test
    void Test_negative_one_AND_zero() {
        BigInteger a = new BigInteger("-1");
        BigInteger b = new BigInteger("0");
        assertEquals(a.multiply(b), new BigInteger("0"));
    }

    @Test
    void Test_negative_one_AND_positive_one() {
        BigInteger a = new BigInteger("-1");
        BigInteger b = new BigInteger("1");
        assertEquals(a.multiply(b), new BigInteger("-1"));
    }

    @Test
    void Test_negative_one_AND_small_positive() {
        BigInteger a = new BigInteger("-1");
        BigInteger b = new BigInteger("3850000");
        assertEquals(a.multiply(b), new BigInteger("-3850000"));
    }

    @Test
    void Test_negative_one_AND_large_positive() {
        BigInteger a = new BigInteger("-1");
        BigInteger b = new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345");
        assertEquals(a.multiply(b),
                new BigInteger("-9859554512121626126165165165165165161665856526754786240624624652625267762345"));
    }

    // Tests mulyiply zero and other numeric types
    @Test
    void Test_zero_AND_large_negative() {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("-84984981516132130456546548547847857485748485584584585845478548458454854785858");
        assertEquals(a.multiply(b), new BigInteger("0"));
    }

    @Test
    void Test_zero_AND_small_negative() {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("-54878165");
        assertEquals(a.multiply(b), new BigInteger("0"));
    }

    @Test
    void Test_zero_AND_negative_one() {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("-1");
        assertEquals(a.multiply(b), new BigInteger("0"));
    }

    @Test
    void Test_zero_AND_zero() {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("0");
        assertEquals(a.multiply(b), new BigInteger("0"));
    }

    @Test
    void Test_zero_AND_positive_one() {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        assertEquals(a.multiply(b), new BigInteger("0"));
    }

    @Test
    void Test_zero_AND_small_positive() {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("3850000");
        assertEquals(a.multiply(b), new BigInteger("0"));
    }

    @Test
    void Test_zero_AND_large_positive() {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345");
        assertEquals(a.multiply(b), new BigInteger("0"));
    }

    // Tests mulyiply positive one and other numeric types
    @Test
    void Test_positive_one_AND_large_negative() {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("-84984981516132130456546548547847857485748485584584585845478548458454854785858");
        assertEquals(a.multiply(b),
                new BigInteger("-84984981516132130456546548547847857485748485584584585845478548458454854785858"));
    }

    @Test
    void Test_positive_one_AND_small_negative() {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("-54878165");
        assertEquals(a.multiply(b), new BigInteger("-54878165"));
    }

    @Test
    void Test_positive_one_AND_negative_one() {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("-1");
        assertEquals(a.multiply(b), new BigInteger("-1"));
    }

    @Test
    void Test_positive_one_AND_zero() {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("0");
        assertEquals(a.multiply(b), new BigInteger("0"));
    }

    @Test
    void Test_positive_one_AND_positive_one() {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        assertEquals(a.multiply(b), new BigInteger("1"));
    }

    @Test
    void Test_positive_one_AND_small_positive() {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("3850000");
        assertEquals(a.multiply(b), new BigInteger("3850000"));
    }

    @Test
    void Test_positive_one_AND_large_positive() {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345");
        assertEquals(a.multiply(b),
                new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345"));
    }

    // Tests mulyiply small positive and other numeric types
    @Test
    void Test_small_positive_AND_large_negative() {
        BigInteger a = new BigInteger("7646800");
        BigInteger b = new BigInteger("-84984981516132130456546548547847857485748485584584585845478548458454854785858");
        assertEquals(a.multiply(b), new BigInteger(
                "-649863156657559175175120147435682996622021519568201411043205364352112583576498954400"));
    }

    @Test
    void Test_small_positive_AND_small_negative() {
        BigInteger a = new BigInteger("7646800");
        BigInteger b = new BigInteger("-54878165");
        assertEquals(a.multiply(b), new BigInteger("-419642352122000"));
    }

    @Test
    void Test_small_positive_AND_negative_one() {
        BigInteger a = new BigInteger("7646800");
        BigInteger b = new BigInteger("-1");
        assertEquals(a.multiply(b), new BigInteger("-7646800"));
    }

    @Test
    void Test_small_positive_AND_zero() {
        BigInteger a = new BigInteger("7646800");
        BigInteger b = new BigInteger("0");
        assertEquals(a.multiply(b), new BigInteger("0"));
    }

    @Test
    void Test_small_positive_AND_positive_one() {
        BigInteger a = new BigInteger("7646800");
        BigInteger b = new BigInteger("1");
        assertEquals(a.multiply(b), new BigInteger("7646800"));
    }

    @Test
    void Test_small_positive_AND_small_positive() {
        BigInteger a = new BigInteger("7646800");
        BigInteger b = new BigInteger("3850000");
        assertEquals(a.multiply(b), new BigInteger("29440180000000"));
    }

    @Test
    void Test_small_positive_AND_large_positive() {
        BigInteger a = new BigInteger("7646800");
        BigInteger b = new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345");
        assertEquals(a.multiply(b),
                new BigInteger("75394041443291650661559784984984984958226471688788499424808379793694897525099746000"));
    }

    // Tests mulyiply large positive and other numeric types
    @Test
    void Test_large_positive_AND_large_negative() {
        BigInteger a = new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345");
        BigInteger b = new BigInteger("-84984981516132130456546548547847857485748485584584585845478548458454854785858");
        assertEquals(a.multiply(b), new BigInteger(
                "-837914057969953541715041458713187230901628945349915363552778430525411342445398632127440026942181176518257813427540675185180197052563804019571345810917010"));
    }

    @Test
    void Test_large_positive_AND_small_negative() {
        BigInteger a = new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345");
        BigInteger b = new BigInteger("-54878165");
        assertEquals(a.multiply(b), new BigInteger(
                "-541074259342705098620002751186186185994150549341576073852727854749837127431149696925"));
    }

    @Test
    void Test_large_positive_AND_negative_one() {
        BigInteger a = new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345");
        BigInteger b = new BigInteger("-1");
        assertEquals(a.multiply(b),
                new BigInteger("-9859554512121626126165165165165165161665856526754786240624624652625267762345"));
    }

    @Test
    void Test_large_positive_AND_zero() {
        BigInteger a = new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345");
        BigInteger b = new BigInteger("0");
        assertEquals(a.multiply(b), new BigInteger("0"));
    }

    @Test
    void Test_large_positive_AND_positive_one() {
        BigInteger a = new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345");
        BigInteger b = new BigInteger("1");
        assertEquals(a.multiply(b),
                new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345"));
    }

    @Test
    void Test_large_positive_AND_small_positive() {
        BigInteger a = new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345");
        BigInteger b = new BigInteger("3850000");
        assertEquals(a.multiply(b),
                new BigInteger("37959284871668260585735885885885885872413547628005927026404804912607280885028250000"));
    }

    @Test
    void Test_large_positive_AND_large_positive() {
        BigInteger a = new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345");
        BigInteger b = new BigInteger("9859554512121626126165165165165165161665856526754786240624624652625267762345");
        assertEquals(a.multiply(b), new BigInteger(
                "97210815177497916986032463837424803464261268218730802751718936655850007546556457732329911224524155820659932255522490550274428686914088432507923399899025"));
    }
}