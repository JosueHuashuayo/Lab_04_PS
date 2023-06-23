package com.test_func_max;

import org.junit.jupiter.api.Test;
import java.math.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestFuncMax {

    // Tests Long Positive vs other numeric types
    @Test
    void Test_Long_Positive_AND_Long_Negative() {
        long a = 722337203685477000L;
        long b = -922337203685477000L;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Long_Positive_AND_Double_Negative() {
        long a = 722337203685477000L;
        double b = -2.4028236E+66;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Long_Positive_AND_Int_Negative() {
        long a = 722337203685477000L;
        int b = -214748364;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Long_Positive_AND_Float_Negative() {
        long a = 722337203685477000L;
        float b = -211111111.5263655325f;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Long_Positive_AND_Short_Negative() {
        long a = 722337203685477000L;
        short b = -3268;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Long_Positive_AND_Byte_Negative() {
        long a = 722337203685477000L;
        byte b = -63;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Long_Positive_AND_Zero() {
        long a = 722337203685477000L;
        int b = 0;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Long_Positive_AND_Byte_Positive() {
        long a = 722337203685477000L;
        byte b = 75;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Long_Positive_AND_Shot_Positive() {
        long a = 722337203685477000L;
        short b = 4267;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Long_Positive_AND_Float_Positive() {
        long a = 722337203685477000L;
        float b = 33242.525325f;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Long_Positive_AND_Int_Positive() {
        long a = 722337203685477000L;
        int b = 314743647;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Long_Positive_AND_Double_Positive() {
        long a = 722337203685477000L;
        double b = 3.4028236E+44;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Long_Positive_AND_Long_Integuers_Positive() {
        long a = 722337203685477000L;
        long b = 922337203685775807L;
        assertEquals(Math.max(a, b), b);
    }

    // Tests Double Positive vs other numeric types
    @Test
    void Test_Double_Positive_AND_Long_Negative() {
        double a = 1.4028236E+59;
        long b = -922337203685477000L;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Double_Positive_AND_Double_Negative() {
        double a = 1.4028236E+59;
        double b = -2.4028236E+66;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Double_Positive_AND_Int_Negative() {
        double a = 1.4028236E+59;
        int b = -214748364;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Double_Positive_AND_Float_Negative() {
        double a = 1.4028236E+59;
        float b = -211111111.5263655325f;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Double_Positive_AND_Short_Negative() {
        double a = 1.4028236E+59;
        short b = -3268;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Double_Positive_AND_Byte_Negative() {
        double a = 1.4028236E+59;
        byte b = -63;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Double_Positive_AND_Zero() {
        double a = 1.4028236E+59;
        int b = 0;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Double_Positive_AND_Byte_Positive() {
        double a = 1.4028236E+59;
        byte b = 75;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Double_Positive_AND_Shot_Positive() {
        double a = 1.4028236E+59;
        short b = 4267;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Double_Positive_AND_Float_Positive() {
        double a = 1.4028236E+59;
        float b = 33242.525325f;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Double_Positive_AND_Int_Positive() {
        double a = 1.4028236E+59;
        int b = 314743647;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Double_Positive_AND_Double_Positive() {
        double a = 1.4028236E+59;
        double b = 3.4028236E+44;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Double_Positive_AND_Long_Integuers_Positive() {
        double a = 1.4028236E+59;
        long b = 922337203685775807L;
        assertEquals(Math.max(a, b), a);
    }

    // Tests Int Positive vs other numeric types
    @Test
    void Test_Int_Positive_AND_Long_Negative() {
        int a = 114748364;
        long b = -922337203685477000L;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Int_Positive_AND_Double_Negative() {
        int a = 114748364;
        double b = -2.4028236E+66;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Int_Positive_AND_Int_Negative() {
        int a = 114748364;
        int b = -214748364;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Int_Positive_AND_Float_Negative() {
        int a = 114748364;
        float b = -211111111.5263655325f;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Int_Positive_AND_Short_Negative() {
        int a = 114748364;
        short b = -3268;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Int_Positive_AND_Byte_Negative() {
        int a = 114748364;
        byte b = -63;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Int_Positive_AND_Zero() {
        int a = 114748364;
        int b = 0;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Int_Positive_AND_Byte_Positive() {
        int a = 114748364;
        byte b = 75;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Int_Positive_AND_Shot_Positive() {
        int a = 114748364;
        short b = 4267;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Int_Positive_AND_Float_Positive() {
        int a = 114748364;
        float b = 33242.525325f;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Int_Positive_AND_Int_Positive() {
        int a = 114748364;
        int b = 314743647;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Int_Positive_AND_Double_Positive() {
        int a = 114748364;
        double b = 3.4028236E+44;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Int_Positive_AND_Long_Integuers_Positive() {
        int a = 114748364;
        long b = 922337203685775807L;
        assertEquals(Math.max(a, b), b);
    }

    // Tests Float Positive vs other numeric types
    @Test
    void Test_Float_Positive_AND_Long_Negative() {
        float a = 211111111.5263655325f;
        long b = -922337203685477000L;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Float_Positive_AND_Double_Negative() {
        float a = 211111111.5263655325f;
        double b = -2.4028236E+66;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Float_Positive_AND_Int_Negative() {
        float a = 211111111.5263655325f;
        int b = -214748364;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Float_Positive_AND_Float_Negative() {
        float a = 211111111.5263655325f;
        float b = -211111111.5263655325f;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Float_Positive_AND_Short_Negative() {
        float a = 211111111.5263655325f;
        short b = -3268;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Float_Positive_AND_Byte_Negative() {
        float a = 211111111.5263655325f;
        byte b = -63;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Float_Positive_AND_Zero() {
        float a = 211111111.5263655325f;
        int b = 0;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Float_Positive_AND_Byte_Positive() {
        float a = 211111111.5263655325f;
        byte b = 75;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Float_Positive_AND_Shot_Positive() {
        float a = 211111111.5263655325f;
        short b = 4267;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Float_Positive_AND_Float_Positive() {
        float a = 211111111.5263655325f;
        float b = 33242.525325f;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Float_Positive_AND_Int_Positive() {
        float a = 211111111.5263655325f;
        int b = 314743647;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Float_Positive_AND_Double_Positive() {
        float a = 211111111.5263655325f;
        double b = 3.4028236E+44;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Float_Positive_AND_Long_Integuers_Positive() {
        float a = 211111111.5263655325f;
        long b = 922337203685775807L;
        assertEquals(Math.max(a, b), b);
    }

    // Tests Shot Positive vs other numeric types
    @Test
    void Test_Shot_Positive_AND_Long_Negative() {
        short a = 3268;
        long b = -922337203685477000L;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Shot_Positive_AND_Double_Negative() {
        short a = 3268;
        double b = -2.4028236E+66;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Shot_Positive_AND_Int_Negative() {
        short a = 3268;
        int b = -214748364;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Shot_Positive_AND_Float_Negative() {
        short a = 3268;
        float b = -211111111.5263655325f;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Shot_Positive_AND_Short_Negative() {
        short a = 3268;
        short b = -3268;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Shot_Positive_AND_Byte_Negative() {
        short a = 3268;
        byte b = -63;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Shot_Positive_AND_Zero() {
        short a = 3268;
        int b = 0;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Shot_Positive_AND_Byte_Positive() {
        short a = 3268;
        byte b = 75;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Shot_Positive_AND_Shot_Positive() {
        short a = 3268;
        short b = 4267;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Shot_Positive_AND_Float_Positive() {
        short a = 3268;
        float b = 33242.525325f;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Shot_Positive_AND_Int_Positive() {
        short a = 3268;
        int b = 314743647;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Shot_Positive_AND_Double_Positive() {
        short a = 3268;
        double b = 3.4028236E+44;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Shot_Positive_AND_Long_Integuers_Positive() {
        short a = 3268;
        long b = 922337203685775807L;
        assertEquals(Math.max(a, b), b);
    }

    // Tests byte Positive vs other numeric types
    @Test
    void Test_Byte_Positive_AND_Long_Negative() {
        byte a = 63;
        long b = -922337203685477000L;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Byte_Positive_AND_Double_Negative() {
        byte a = 63;
        double b = -2.4028236E+66;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Byte_Positive_AND_Int_Negative() {
        byte a = 63;
        int b = -214748364;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Byte_Positive_AND_Float_Negative() {
        byte a = 63;
        float b = -211111111.5263655325f;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Byte_Positive_AND_Short_Negative() {
        byte a = 63;
        short b = -3268;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Byte_Positive_AND_Byte_Negative() {
        byte a = 63;
        byte b = -63;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Byte_Positive_AND_Zero() {
        byte a = 63;
        int b = 0;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Byte_Positive_AND_Byte_Positive() {
        byte a = 63;
        byte b = 75;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Byte_Positive_AND_Shot_Positive() {
        byte a = 63;
        short b = 4267;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Byte_Positive_AND_Float_Positive() {
        byte a = 63;
        float b = 33242.525325f;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Byte_Positive_AND_Int_Positive() {
        byte a = 63;
        int b = 314743647;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Byte_Positive_AND_Double_Positive() {
        byte a = 63;
        double b = 3.4028236E+44;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Byte_Positive_AND_Long_Integuers_Positive() {
        byte a = 63;
        long b = 922337203685775807L;
        assertEquals(Math.max(a, b), b);
    }

    // Tests 0 vs other numeric types
    @Test
    void Test_Zero_AND_Long_Negative() {
        int a = 0;
        long b = -922337203685477000L;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Zero_AND_Double_Negative() {
        int a = 0;
        double b = -2.4028236E+66;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Zero_AND_Int_Negative() {
        int a = 0;
        int b = -214748364;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Zero_AND_Float_Negative() {
        int a = 0;
        float b = -211111111.5263655325f;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Zero_AND_Short_Negative() {
        int a = 0;
        short b = -3268;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Zero_AND_Byte_Negative() {
        int a = 0;
        byte b = -63;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Zero_AND_Zero() {
        int a = 0;
        int b = 0;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Zero_AND_Byte_Positive() {
        int a = 0;
        byte b = 75;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Zero_AND_Shot_Positive() {
        int a = 0;
        short b = 4267;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Zero_AND_Float_Positive() {
        int a = 0;
        float b = 33242.525325f;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Zero_AND_Int_Positive() {
        int a = 0;
        int b = 314743647;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Zero_AND_Double_Positive() {
        int a = 0;
        double b = 3.4028236E+44;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Zero_AND_Long_Integuers_Positive() {
        int a = 0;
        long b = 922337203685775807L;
        assertEquals(Math.max(a, b), b);
    }

    // Tests byte Negative vs other numeric types
    @Test
    void Test_Byte_Negative_AND_Long_Negative() {
        byte a = -75;
        long b = -922337203685477000L;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Byte_Negative_AND_Double_Negative() {
        byte a = -75;
        double b = -2.4028236E+66;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Byte_Negative_AND_Int_Negative() {
        byte a = -75;
        int b = -214748364;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Byte_Negative_AND_Float_Negative() {
        byte a = -75;
        float b = -211111111.5263655325f;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Byte_Negative_AND_Short_Negative() {
        byte a = -75;
        short b = -3268;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Byte_Negative_AND_Byte_Negative() {
        byte a = -75;
        byte b = -63;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Byte_Negative_AND_Zero() {
        byte a = -75;
        int b = 0;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Byte_Negative_AND_Byte_Positive() {
        byte a = -75;
        byte b = 75;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Byte_Negative_AND_Shot_Positive() {
        byte a = -75;
        short b = 4267;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Byte_Negative_AND_Float_Positive() {
        byte a = -75;
        float b = 33242.525325f;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Byte_Negative_AND_Int_Positive() {
        byte a = -75;
        int b = 314743647;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Byte_Negative_AND_Double_Positive() {
        byte a = -75;
        double b = 3.4028236E+44;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Byte_Negative_AND_Long_Integuers_Positive() {
        byte a = -75;
        long b = 922337203685775807L;
        assertEquals(Math.max(a, b), b);
    }

    // Tests Short Negative vs other numeric types
    @Test
    void Test_Short_Negative_AND_Long_Negative() {
        short a = -4267;
        long b = -922337203685477000L;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Short_Negative_AND_Double_Negative() {
        short a = -4267;
        double b = -2.4028236E+66;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Short_Negative_AND_Int_Negative() {
        short a = -4267;
        int b = -214748364;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Short_Negative_AND_Float_Negative() {
        short a = -4267;
        float b = -211111111.5263655325f;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Short_Negative_AND_Short_Negative() {
        short a = -4267;
        short b = -3268;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Short_Negative_AND_Byte_Negative() {
        short a = -4267;
        byte b = -63;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Short_Negative_AND_Zero() {
        short a = -4267;
        int b = 0;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Short_Negative_AND_Byte_Positive() {
        short a = -4267;
        byte b = 75;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Short_Negative_AND_Shot_Positive() {
        short a = -4267;
        short b = 4267;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Short_Negative_AND_Float_Positive() {
        short a = -4267;
        float b = 33242.525325f;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Short_Negative_AND_Int_Positive() {
        short a = -4267;
        int b = 314743647;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Short_Negative_AND_Double_Positive() {
        short a = -4267;
        double b = 3.4028236E+44;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Short_Negative_AND_Long_Integuers_Positive() {
        short a = -4267;
        long b = 922337203685775807L;
        assertEquals(Math.max(a, b), b);
    }

    // Tests Float Negative vs other numeric types
    @Test
    void Test_Float_Negative_AND_Long_Negative() {
        float a = -33242.525325f;
        long b = -922337203685477000L;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Float_Negative_AND_Double_Negative() {
        float a = -33242.525325f;
        double b = -2.4028236E+66;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Float_Negative_AND_Int_Negative() {
        float a = -33242.525325f;
        int b = -214748364;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Float_Negative_AND_Float_Negative() {
        float a = -33242.525325f;
        float b = -211111111.5263655325f;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Float_Negative_AND_Short_Negative() {
        float a = -33242.525325f;
        short b = -3268;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Float_Negative_AND_Byte_Negative() {
        float a = -33242.525325f;
        byte b = -63;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Float_Negative_AND_Zero() {
        float a = -33242.525325f;
        int b = 0;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Float_Negative_AND_Byte_Positive() {
        float a = -33242.525325f;
        byte b = 75;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Float_Negative_AND_Shot_Positive() {
        float a = -33242.525325f;
        short b = 4267;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Float_Negative_AND_Float_Positive() {
        float a = -33242.525325f;
        float b = 33242.525325f;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Float_Negative_AND_Int_Positive() {
        float a = -33242.525325f;
        int b = 314743647;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Float_Negative_AND_Double_Positive() {
        float a = -33242.525325f;
        double b = 3.4028236E+44;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Float_Negative_AND_Long_Integuers_Positive() {
        float a = -33242.525325f;
        long b = 922337203685775807L;
        assertEquals(Math.max(a, b), b);
    }

    // Tests Int Negative vs other numeric types
    @Test
    void Test_Int_Negative_AND_Long_Negative() {
        int a = -314743647;
        long b = -922337203685477000L;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Int_Negative_AND_Double_Negative() {
        int a = -314743647;
        double b = -2.4028236E+66;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Int_Negative_AND_Int_Negative() {
        int a = -314743647;
        int b = -214748364;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Int_Negative_AND_Float_Negative() {
        int a = -314743647;
        float b = -211111111.5263655325f;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Int_Negative_AND_Short_Negative() {
        int a = -314743647;
        short b = -3268;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Int_Negative_AND_Byte_Negative() {
        int a = -314743647;
        byte b = -63;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Int_Negative_AND_Zero() {
        int a = -314743647;
        int b = 0;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Int_Negative_AND_Byte_Positive() {
        int a = -314743647;
        byte b = 75;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Int_Negative_AND_Shot_Positive() {
        int a = -314743647;
        short b = 4267;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Int_Negative_AND_Float_Positive() {
        int a = -314743647;
        float b = 33242.525325f;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Int_Negative_AND_Int_Positive() {
        int a = -314743647;
        int b = 314743647;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Int_Negative_AND_Double_Positive() {
        int a = -314743647;
        double b = 3.4028236E+44;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Int_Negative_AND_Long_Integuers_Positive() {
        int a = -314743647;
        long b = 922337203685775807L;
        assertEquals(Math.max(a, b), b);
    }

    // Tests Double Negative vs other numeric types
    @Test
    void Test_Double_Negative_AND_Long_Negative() {
        double a = -3.3728236E+42;
        long b = -922337203685477000L;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Double_Negative_AND_Double_Negative() {
        double a = -3.3728236E+42;
        double b = -2.4028236E+66;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Double_Negative_AND_Int_Negative() {
        double a = -3.3728236E+42;
        int b = -214748364;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Double_Negative_AND_Float_Negative() {
        double a = -3.3728236E+42;
        float b = -211111111.5263655325f;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Double_Negative_AND_Short_Negative() {
        double a = -3.3728236E+42;
        short b = -3268;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Double_Negative_AND_Byte_Negative() {
        double a = -3.3728236E+42;
        byte b = -63;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Double_Negative_AND_Zero() {
        double a = -3.3728236E+42;
        int b = 0;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Double_Negative_AND_Byte_Positive() {
        double a = -3.3728236E+42;
        byte b = 75;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Double_Negative_AND_Shot_Positive() {
        double a = -3.3728236E+42;
        short b = 4267;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Double_Negative_AND_Float_Positive() {
        double a = -3.3728236E+42;
        float b = 33242.525325f;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Double_Negative_AND_Int_Positive() {
        double a = -3.3728236E+42;
        int b = 314743647;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Double_Negative_AND_Double_Positive() {
        double a = -3.3728236E+42;
        double b = 3.4028236E+44;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Double_Negative_AND_Long_Integuers_Positive() {
        double a = -3.3728236E+42;
        long b = 922337203685775807L;
        assertEquals(Math.max(a, b), b);
    }

    // Tests Long Negative vs other numeric types
    @Test
    void Test_Long_Negative_AND_Long_Negative() {
        long a = -862537203685775807L;
        long b = -922337203685477000L;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Long_Negative_AND_Double_Negative() {
        long a = -862537203685775807L;
        double b = -2.4028236E+66;
        assertEquals(Math.max(a, b), a);
    }

    @Test
    void Test_Long_Negative_AND_Int_Negative() {
        long a = -862537203685775807L;
        int b = -214748364;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Long_Negative_AND_Float_Negative() {
        long a = -862537203685775807L;
        float b = -211111111.5263655325f;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Long_Negative_AND_Short_Negative() {
        long a = -862537203685775807L;
        short b = -3268;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Long_Negative_AND_Byte_Negative() {
        long a = -862537203685775807L;
        byte b = -63;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Long_Negative_AND_Zero() {
        long a = -862537203685775807L;
        int b = 0;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Long_Negative_AND_Byte_Positive() {
        long a = -862537203685775807L;
        byte b = 75;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Long_Negative_AND_Shot_Positive() {
        long a = -862537203685775807L;
        short b = 4267;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Long_Negative_AND_Float_Positive() {
        long a = -862537203685775807L;
        float b = 33242.525325f;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Long_Negative_AND_Int_Positive() {
        long a = -862537203685775807L;
        int b = 314743647;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Long_Negative_AND_Double_Positive() {
        long a = -862537203685775807L;
        double b = 3.4028236E+44;
        assertEquals(Math.max(a, b), b);
    }

    @Test
    void Test_Long_Negative_AND_Long_Integuers_Positive() {
        long a = -862537203685775807L;
        long b = 922337203685775807L;
        assertEquals(Math.max(a, b), b);
    }

    // Tests Big Integuers Positive vs other numeric types
    @Test
    void Test_Big_Integuers_Positive_AND_Big_Integuers_Negatives() {
        BigInteger a = new BigInteger("99999989898989889898989898989898989898");
        BigInteger b = new BigInteger("89999989898989889898989898989898989898");
        assertEquals(b.max(a), a);
    }

    @Test
    void Test_Big_Integuers_Positive_AND_Big_Integuers_Positive() {
        BigInteger a = new BigInteger("99999989898989889898989898989898989898");
        BigInteger b = new BigInteger("-89999989898989889898989898989898989898");
        assertEquals(b.max(a), a);
    }

    @Test
    void Test_BigInteguers_Negative_AND_Big_Integuers_Positive() {
        BigInteger a = new BigInteger("-89999989898989889898989898989898989898");
        BigInteger b = new BigInteger("99999989898989889898989898989898989898");
        assertEquals(a.max(b), b);
    }

    @Test
    void Test_BigInteguers_Negative_AND_Big_Integuers_Negative() {
        BigInteger a = new BigInteger("-89999989898989889898989898989898989898");
        BigInteger b = new BigInteger("-99999989898989889898989898989898989898");
        assertEquals(a.max(b), a);
    }
}
