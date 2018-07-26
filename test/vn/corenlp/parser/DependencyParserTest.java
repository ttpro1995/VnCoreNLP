/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.corenlp.parser;

import java.io.IOException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import vn.corenlp.ner.NerRecognizer;
import vn.corenlp.postagger.PosTagger;
import vn.pipeline.Word;

/**
 *
 * @author thient <thient@vng.com.vn>
 */
public class DependencyParserTest {
    
    public DependencyParserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initialize method, of class DependencyParser.
     */
    @Test
    public void testInitialize() throws Exception {
        System.out.println("initialize");
        DependencyParser expResult = null;
        DependencyParser result = DependencyParser.initialize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tagSentence method, of class DependencyParser.
     */
    @Test
    public void testTagSentence() throws IOException {
        System.out.println("tagSentence");
        String inSentence = "UBND xã Hương_Hòa ( huyện Nam_Đông , Thừa_Thiên - Huế ) vừa ban_hành quyết_định xử_phạt vi_phạm hành_chính đối_với bà Nguyễn_Thị_Lỗi ( 44 tuổi ) vì chuyển mục_đích sử_dụng đất nông_nghiệp trái_phép .";
        PosTagger tagger = new PosTagger();
        List<Word> sentenceWords = tagger.tagSentence(inSentence);
        NerRecognizer instance = new NerRecognizer();
        instance.tagSentence(sentenceWords);
        DependencyParser parser = new DependencyParser();
        parser.tagSentence(sentenceWords);
        for (Word w: sentenceWords){
            System.out.println(w.toString());
        }
    }

    /**
     * Test of main method, of class DependencyParser.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DependencyParser.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
