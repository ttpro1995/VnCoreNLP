/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.corenlp.postagger;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import vn.pipeline.Word;

/**
 *
 * @author thient <thient@vng.com.vn>
 */
public class PosTaggerTest {
    
    public PosTaggerTest() {
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
     * Test of initialize method, of class PosTagger.
     */
    @Test
    public void testInitialize() throws Exception {
        System.out.println("initialize");
        PosTagger expResult = null;
        PosTagger result = PosTagger.initialize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tagSentence method, of class PosTagger.
     */
    @Test
    public void testTagSentence() throws Exception {
        System.out.println("tagSentence");
        String sentence = "UBND xã Hương Hòa (huyện Nam Đông, Thừa Thiên - Huế) vừa ban hành quyết định xử phạt vi phạm hành chính đối với bà Nguyễn Thị Lỗi (44 tuổi) vì chuyển mục đích sử dụng đất nông nghiệp trái phép.";
        String tokSentence = "UBND xã Hương_Hòa ( huyện Nam_Đông , Thừa_Thiên - Huế ) vừa ban_hành quyết_định xử_phạt vi_phạm hành_chính đối_với bà Nguyễn_Thị_Lỗi ( 44 tuổi ) vì chuyển mục_đích sử_dụng đất nông_nghiệp trái_phép .";
        PosTagger instance = new PosTagger();
        
        List<Word> result = instance.tagSentence(tokSentence);
        for (Word w : result){
            System.out.println(w.toString());
        }
    }
    
}
