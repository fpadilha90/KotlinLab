package com.example.kotlinlab

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class PollutionStressTest {

    private lateinit var subject: Pollution

    @BeforeEach
    fun setUp() {
        subject = Pollution()
    }

    private val ints = intArrayOf(
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9
    )
    @Test fun test1(){
        assertEquals(207, subject.solution(ints))
    }
    @Test fun bruteForceTest1(){
        assertEquals(207, subject.bruteForceSolution(ints))
    }

    private val ints2 = intArrayOf(322,
        307,
        12,
        487,
        374,
        34,
        80,
        312,
        263,
        205,
        156,
        106,
        435,
        95,
        8,
        340,
        169,
        190,
        321,
        406,
        480,
        369,
        359,
        235,
        7,
        5,
        233,
        67,
        80,
        13,
        67,
        102,
        444,
        338,
        19,
        328,
        251,
        90,
        365,
        20,
        177,
        363,
        387,
        279,
        494,
        263,
        119,
        17,
        272,
        253,
        267,
        65,
        472,
        62,
        56,
        309,
        76,
        360,
        301,
        452,
        234,
        463,
        337,
        372,
        374,
        355,
        10,
        130,
        282,
        137,
        327,
        99,
        437,
        185,
        262,
        307,
        17,
        149,
        285,
        481,
        161,
        119,
        26,
        51,
        91,
        63,
        87,
        424,
        370,
        29,
        455,
        241,
        246,
        438,
        414,
        79,
        43,
        118,
        282,
        88,
        131,
        308,
        426,
        256,
        46,
        467,
        154,
        8,
        62,
        384,
        2,
        58,
        218,
        171,
        259,
        235,
        320,
        401,
        460,
        108,
        148,
        165,
        224,
        398,
        213,
        193,
        302,
        190,
        15,
        213,
        380,
        156,
        106,
        456,
        243,
        500,
        355,
        66,
        104,
        187,
        62,
        235,
        166,
        414,
        125,
        291,
        244,
        150,
        267,
        31,
        318,
        210,
        78,
        229,
        199,
        132,
        182,
        482,
        197,
        136,
        319,
        27,
        242,
        215,
        110,
        407,
        104,
        33,
        277,
        342,
        218,
        262,
        21,
        482,
        55,
        40,
        289,
        67,
        347,
        336,
        92,
        29,
        397,
        255,
        112,
        430,
        376,
        13,
        270,
        71,
        483,
        309,
        477,
        158,
        438,
        131,
        242,
        481,
        236,
        472,
        294,
        185,
        238,
        39,
        138,
        293,
        396,
        222,
        472,
        150,
        414,
        184,
        467,
        295,
        435,
        450,
        392,
        60,
        404,
        499,
        1,
        386,
        329,
        402,
        164,
        38,
        458,
        407,
        243,
        64,
        78,
        137,
        388,
        383,
        58,
        285,
        121,
        353,
        107,
        345,
        175,
        468,
        204,
        58,
        152,
        315,
        403,
        327,
        289,
        272)
    @Test fun test2(){
        assertEquals(188, subject.solution(ints2))
    }
    @Test fun bruteForceTest2(){
        assertEquals(188, subject.bruteForceSolution(ints2))
    }

    private val ints3 = intArrayOf(239,
        966,
        102,
        927,
        914,
        743,
        537,
        374,
        220,
        812,
        971,
        853,
        588,
        623,
        550,
        632,
        242,
        886,
        239,
        817,
        297,
        613,
        401,
        343,
        952,
        272,
        589,
        817,
        386,
        694,
        336,
        142,
        547,
        277,
        277,
        684,
        391,
        404,
        575,
        717,
        949,
        913,
        970,
        970,
        252,
        626,
        160,
        784,
        596,
        114,
        559,
        627,
        870,
        859,
        583,
        587,
        518,
        603,
        474,
        172,
        980,
        960,
        409,
        723,
        865,
        710,
        594,
        121,
        204,
        845,
        969,
        394,
        996,
        163,
        586,
        430,
        224,
        287,
        870,
        590,
        289,
        769,
        396,
        886,
        945,
        210,
        230,
        379,
        331,
        560,
        990,
        855,
        787,
        237,
        822,
        669,
        711,
        157,
        364,
        996,
        479,
        573,
        724,
        832,
        184,
        225,
        206,
        364,
        887,
        941,
        591,
        378,
        121,
        471,
        146,
        859,
        859,
        716,
        972,
        555,
        659,
        551,
        807,
        269,
        533,
        842,
        350,
        173,
        666,
        813,
        170,
        399,
        986,
        865,
        354,
        981,
        376,
        341,
        309,
        146,
        871,
        404,
        808,
        344,
        225,
        825,
        383,
        340,
        824,
        923,
        772,
        479,
        393,
        104,
        243,
        217,
        605,
        257,
        230,
        694,
        228,
        607,
        998,
        964,
        572,
        828,
        328,
        783,
        574,
        335,
        897,
        786,
        945,
        681,
        333,
        632,
        475,
        848,
        724,
        666,
        299,
        238,
        383,
        436,
        409,
        818,
        194,
        746,
        192,
        770,
        101,
        399,
        594,
        193,
        474,
        930,
        761,
        478,
        646,
        294,
        327,
        445,
        337,
        874,
        862,
        535,
        709,
        833,
        121,
        827,
        564,
        113,
        484,
        857,
        397,
        743,
        377,
        651,
        539,
        322,
        988,
        910,
        491,
        618,
        353,
        295,
        795,
        954,
        432,
        103,
        544,
        186,
        354,
        644,
        930,
        680,
        465,
        320,
        931,
        910,
        280,
        480,
        917,
        584,
        186,
        860,
        783,
        297,
        260,
        276)
    @Test fun test3(){
        assertEquals(212, subject.solution(ints3))
    }
    @Test fun bruteForceTest3(){
        assertEquals(212, subject.bruteForceSolution(ints3))
    }

    private val ints4 = intArrayOf(61954,
        8791,
        853,
        96492,
        78752,
        20271,
        51708,
        76201,
        35368,
        75179,
        91815,
        65803,
        66144,
        9194,
        23125,
        54159,
        32720,
        14089,
        37434,
        3412,
        6201,
        7913,
        55774,
        29825,
        9033,
        42703,
        45021,
        12514,
        65878,
        99663,
        28534,
        78899,
        2658,
        68048,
        67923,
        27896,
        31108,
        93630,
        43172,
        69349,
        34098,
        56276,
        31892,
        81464,
        60837,
        88870,
        63541,
        37964,
        3093,
        49104,
        29279,
        19185,
        10286,
        61145,
        83704,
        91918,
        29466,
        44857,
        70322,
        45620,
        85248,
        63551,
        26451,
        74958,
        53238,
        24032,
        74360,
        27840,
        54285,
        56543,
        51111,
        87034,
        59846,
        15007,
        8775,
        63995,
        68948,
        2433,
        10434,
        47409,
        19867,
        40503,
        29571,
        48256,
        2547,
        41600,
        78736,
        96255,
        83825,
        94834,
        61287,
        5022,
        38562,
        74042,
        40864,
        12679,
        79524,
        62534,
        62469,
        91828,
        70048,
        1099,
        83266,
        34504,
        5202,
        99470,
        38545,
        27461,
        28918,
        87445,
        58945,
        40671,
        12602,
        40462,
        58567,
        72577,
        50694,
        58479,
        4184,
        80688,
        87489,
        38116,
        19388,
        98755,
        72086,
        15021,
        61636,
        18055,
        81824,
        87564,
        15989,
        25628,
        58137,
        58664,
        32950,
        44935,
        56183,
        56977,
        62461,
        89570,
        18302,
        67480,
        94547,
        75955,
        67160,
        65030,
        70047,
        71421,
        94014,
        65706,
        63477,
        18399,
        38852,
        90698,
        62171,
        27475,
        85233,
        73642,
        44572,
        89036,
        35470,
        54914,
        64769,
        97066,
        20114,
        90456,
        20746,
        70389,
        77634,
        2301,
        81092,
        5299,
        98793,
        45141,
        72647,
        44863,
        78640,
        4406,
        26778,
        71316,
        32130,
        91330,
        45230,
        82608,
        74601,
        11515,
        86519,
        44912,
        91412,
        608,
        47047,
        45070,
        54607,
        20764,
        69057,
        22504,
        97309,
        25567,
        49485,
        76467,
        77576,
        33342,
        82164,
        69773,
        67044,
        88683,
        6345,
        14439,
        95159,
        96836,
        16294,
        57620,
        26513,
        7706,
        81132,
        72838,
        86016,
        4562,
        1298,
        95521,
        19312,
        42289,
        90760,
        77557,
        11759,
        8263,
        60379,
        27133,
        51541,
        16054,
        76396,
        33870,
        29616,
        78891,
        45983,
        11415,
        60626,
        46622,
        85956,
        28424,
        75571,
        39913,
        37236,
        8840,
        126,
        33114,
        5283,
        19838,
        57296,
        66672,
        24358,
        57483,
        52881,
        30940,
        11342,
        26976,
        39487,
        65747,
        81621,
        23581,
        97254,
        17242,
        97830,
        64990,
        4804,
        33265,
        37625,
        9657,
        70756,
        9300,
        12626,
        30779,
        31178,
        12272,
        3496,
        34761,
        92548,
        55700,
        38809,
        30268,
        55731,
        62776,
        4157,
        20922,
        73639,
        9531,
        44144,
        50228,
        63272,
        5877,
        70454,
        49831,
        55515,
        74016,
        57773,
        28978,
        4582,
        69863,
        97102,
        32247)
    @Test fun test4(){
        assertEquals(231, subject.solution(ints4))
    }
    @Test fun bruteForceTest4(){
        assertEquals(231, subject.bruteForceSolution(ints4))
    }

    private val ints5 = intArrayOf(63,
        55,
        56,
        44,
        71,
        71,
        21,
        4,
        90,
        86,
        51,
        38,
        8,
        63,
        11,
        62,
        59,
        2,
        85,
        40,
        18,
        45,
        68,
        2,
        79,
        25,
        81,
        78,
        69,
        55,
        3,
        99,
        69,
        22,
        94,
        81,
        86,
        11,
        27,
        84,
        54,
        83,
        56,
        27,
        85,
        13,
        17,
        90,
        26,
        5,
        31,
        36,
        97,
        41,
        50,
        32,
        13,
        7,
        88,
        48,
        5,
        20,
        13,
        66,
        61,
        84,
        56,
        43,
        11,
        17,
        7,
        80,
        15,
        85,
        28,
        17,
        97,
        19,
        42,
        46,
        61,
        52,
        60,
        10,
        17,
        35,
        93,
        51,
        96,
        23,
        16,
        28,
        31,
        66,
        74,
        25,
        24,
        94,
        63,
        69,
        54,
        21,
        59,
        25,
        75,
        33,
        14,
        33,
        25,
        58,
        72,
        73,
        5,
        44,
        100,
        84,
        100,
        41,
        14,
        2,
        45,
        82,
        38,
        3,
        83,
        64,
        62,
        42,
        72,
        37,
        70,
        4,
        79,
        48,
        96,
        90,
        100,
        79,
        24,
        100,
        79,
        13,
        94,
        25,
        55,
        31,
        48,
        46,
        88,
        63,
        25,
        63,
        56,
        74,
        22,
        48,
        91,
        65,
        91,
        85,
        63,
        22,
        48,
        42,
        40,
        84,
        72,
        31,
        83,
        38,
        30,
        77,
        35,
        87,
        66,
        14,
        53,
        77,
        39,
        27,
        46,
        88,
        66,
        25,
        40,
        60,
        96,
        44,
        5,
        23,
        78,
        81,
        79,
        25,
        72,
        30,
        32,
        70,
        47,
        61,
        65,
        50,
        75,
        26,
        5,
        72,
        67,
        100,
        36,
        40,
        53,
        13,
        11,
        3,
        5,
        92,
        23,
        24,
        29,
        71,
        36,
        61,
        35,
        2,
        14,
        100,
        100,
        79,
        75,
        17,
        32,
        91,
        81,
        46,
        39,
        93,
        14,
        58,
        34,
        67,
        9,
        45,
        76,
        30,
        26,
        46,
        20,
        56,
        82,
        72,
        58,
        80,
        99,
        59,
        25,
        56,
        96,
        32,
        67,
        92,
        16,
        50,
        69,
        43,
        81,
        10,
        96,
        80,
        37,
        67,
        86,
        25,
        23,
        2,
        22,
        45,
        69,
        63,
        88,
        83,
        19,
        91,
        1,
        46,
        82,
        91,
        35,
        24,
        42,
        39,
        91,
        48,
        99,
        38,
        90,
        62,
        34,
        28,
        34,
        74,
        78,
        80,
        28,
        30,
        74,
        13,
        90,
        45,
        72,
        50,
        67,
        15,
        32,
        58,
        42,
        23,
        35,
        52,
        100,
        88,
        78,
        88,
        50,
        52,
        6,
        29,
        93,
        83,
        95,
        15,
        68,
        95,
        66,
        35,
        23,
        74,
        31,
        72,
        23,
        45,
        67,
        14,
        53,
        57,
        43,
        56,
        72,
        11,
        87,
        97,
        48,
        39,
        39,
        29,
        60,
        55,
        59,
        58,
        72,
        11,
        80,
        53,
        73,
        7,
        56,
        73,
        99,
        41,
        23,
        67,
        50,
        19,
        21,
        82,
        81,
        37,
        100,
        65,
        67,
        85,
        75,
        19,
        40,
        94,
        16,
        19,
        26,
        39,
        85,
        98,
        20,
        87,
        94,
        19,
        100,
        48,
        82,
        24,
        78,
        40)
    @Test fun test5(){
        assertEquals(321, subject.solution(ints5))
    }
    @Test fun bruteForceTest5(){
        assertEquals(321, subject.bruteForceSolution(ints5))
    }

}