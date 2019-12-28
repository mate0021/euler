package rnd.mate00.codewars.mostfreqwords;

import org.junit.Test;

import java.util.Collections;
import java.util.stream.*;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class TopWordsTest {

    @Test
    public void sampleTests() {
        assertEquals(Arrays.asList("a", "of", "on"),  TopWords.top3(Stream
                .of("In a village of La Mancha, the name of which I have no desire to call to",
                        "mind, there lived not long since one of those gentlemen that keep a lance",
                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                        "coursing. An olla of rather more beef than mutton, a salad on most",
                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                        "on Sundays, made away with three-quarters of his income.")
                .collect(Collectors.joining("\n")) ));
    }

    @Test
    public void t1() {
        assertEquals(Arrays.asList("e", "ddd", "aa"), TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
    }

    @Test
    public void t2() {
        assertEquals(Arrays.asList("e", "d", "a"), TopWords.top3("a a a  b  c c  d d d d  e e e e e"));
    }

    @Test
    public void t3() {
        assertEquals(Arrays.asList("won't", "wont"), TopWords.top3("  //wont won't won't "));
    }

    @Test
    public void t4() {
        assertEquals(Arrays.asList("e"), TopWords.top3("  , e   .. "));
    }

    @Test
    public void t5() {
        assertEquals(Collections.emptyList(), TopWords.top3("  ...  "));
    }

    @Test
    public void t6() {
        assertEquals(Collections.emptyList(), TopWords.top3("  '''  "));
    }

    @Test
    public void t7() {
        assertEquals(Collections.emptyList(), TopWords.top3("  '  "));
    }

    @Test
    public void veryLarge() {
        String input = "LBh'TULN;Tzyzy,ULPOxWRZ;BsxGKF?sdvPWyujZL,Tzyzy yzsU-huk_yzsU QYZdFBxUR GRmIxre lbim/uGBZM kLExG LBh'TULN,ULPOxWRZ.GRmIxre kLExG!uGBZM-uGBZM lbim_kLExG:FEPXuWDF-UXdPXA Tzyzy!BLiDc Tzyzy?BsxGKF-QYZdFBxUR UXdPXA UXdPXA FqIbYj_UXdPXA uGBZM GRmIxre FqIbYj/yzsU XXAxs,LBh'TULN,FqIbYj huk!XXAxs-Tzyzy yzsU:GRmIxre UXdPXA?XXAxs.yzsU FqIbYj-uGBZM XXAxs QYZdFBxUR kLExG kLExG uGBZM huk/XXAxs;GRmIxre:sCoQORjv GRmIxre LBh'TULN!FEPXuWDF QYZdFBxUR:FqIbYj uGBZM/QYZdFBxUR.LBh'TULN yzsU uGBZM,Tzyzy!FEPXuWDF GRmIxre GRmIxre,sdvPWyujZL ULPOxWRZ QYZdFBxUR FEPXuWDF.uGBZM Tzyzy BsxGKF;XXAxs-XXAxs LBh'TULN XXAxs-yzsU;LBh'TULN XXAxs,uGBZM ULPOxWRZ;QYZdFBxUR XXAxs-huk.uGBZM GRmIxre yzsU FqIbYj:GRmIxre LBh'TULN.FEPXuWDF LBh'TULN GRmIxre?ULPOxWRZ.ULPOxWRZ,kLExG BsxGKF_QYZdFBxUR XXAxs:XXAxs sdvPWyujZL,BLiDc LBh'TULN BsxGKF huk;FEPXuWDF ULPOxWRZ;lbim UXdPXA FEPXuWDF:vQUlhxKBba kLExG BsxGKF/lbim uGBZM QrNpzFLmPQ vQUlhxKBba LBh'TULN GRmIxre.ULPOxWRZ uGBZM/lbim lbim FEPXuWDF yzsU!huk.huk?GRmIxre XXAxs/ULPOxWRZ-lbim?yzsU FEPXuWDF LBh'TULN FEPXuWDF!XXAxs XXAxs ULPOxWRZ/kLExG Tzyzy yzsU.uGBZM/ULPOxWRZ huk_FEPXuWDF;FqIbYj yzsU ULPOxWRZ_LBh'TULN.uGBZM huk,BsxGKF.GRmIxre-yzsU:ULPOxWRZ Tzyzy yzsU;Tzyzy/GRmIxre:uGBZM QYZdFBxUR-Tzyzy huk/FqIbYj UXdPXA:lbim FEPXuWDF UXdPXA lbim/ULPOxWRZ_FqIbYj kLExG uGBZM!GRmIxre!yzsU UXdPXA,uGBZM_UXdPXA;FqIbYj ULPOxWRZ ULPOxWRZ Tzyzy LBh'TULN lbim yzsU FEPXuWDF.uGBZM XXAxs ULPOxWRZ huk Tzyzy,LBh'TULN-BsxGKF!uGBZM!BsxGKF GRmIxre_yzsU FEPXuWDF?UXdPXA;UXdPXA LBh'TULN/ULPOxWRZ_UXdPXA:lbim FEPXuWDF!uGBZM UXdPXA BLiDc?Tzyzy/GRmIxre lbim.LBh'TULN-Tzyzy_XXAxs Tzyzy Tzyzy XXAxs uGBZM UXdPXA;Tzyzy QYZdFBxUR/UXdPXA:UXdPXA?Tzyzy-BLiDc?kLExG BLiDc?FqIbYj.kLExG QYZdFBxUR!FEPXuWDF;sdvPWyujZL.lbim_FqIbYj!XXAxs LBh'TULN.huk_QYZdFBxUR UXdPXA huk LBh'TULN_kLExG GRmIxre FEPXuWDF GRmIxre,UXdPXA huk?FEPXuWDF uGBZM LBh'TULN BLiDc UXdPXA,BsxGKF FqIbYj?Tzyzy!GRmIxre GRmIxre GRmIxre.GRmIxre:ULPOxWRZ_yzsU/UXdPXA BsxGKF!uGBZM-XXAxs/huk huk Tzyzy Tzyzy yzsU!kLExG Tzyzy?yzsU_lbim yzsU:UXdPXA LBh'TULN?yzsU Tzyzy uGBZM?XXAxs yzsU,QYZdFBxUR sdvPWyujZL vQUlhxKBba;UXdPXA GRmIxre FEPXuWDF huk:BsxGKF GRmIxre;Tzyzy uGBZM?GRmIxre QYZdFBxUR kLExG LBh'TULN/lbim/FqIbYj uGBZM/huk ULPOxWRZ uGBZM yzsU BLiDc lbim LBh'TULN uGBZM kLExG!QYZdFBxUR Tzyzy vQUlhxKBba FEPXuWDF:FEPXuWDF/QYZdFBxUR:FqIbYj FqIbYj_LBh'TULN.BsxGKF.FqIbYj kLExG uGBZM LBh'TULN_FEPXuWDF yzsU GRmIxre lbim FEPXuWDF;LBh'TULN-yzsU BsxGKF?XXAxs Tzyzy XXAxs XXAxs yzsU Tzyzy:ULPOxWRZ!Tzyzy!UXdPXA,FqIbYj Tzyzy.";
        TopWords.top3(input);
    }
}