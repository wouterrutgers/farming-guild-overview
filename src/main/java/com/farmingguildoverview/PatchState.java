package com.farmingguildoverview;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.Varbits;

@RequiredArgsConstructor
@Getter
public enum PatchState {
    REDWOOD("Redwood tree", Varbits.FARMING_7907) {
        @Override
        public String forVarbitValue(int value) {
            if (value >= 0 && value <= 3)
            {
                // Redwood tree patch[Rake,Inspect,Guide] 34050,34049,34048,34047
                return "Empty";
            }
            if (value >= 4 && value <= 7)
            {
                // Redwood tree patch[Rake,Inspect,Guide] 34050,34050,34050,34050
                return "Empty";
            }
            if (value >= 8 && value <= 17)
            {
                // Redwood tree[Inspect,Guide] 34205,34206,34207,34208,34209,34210,34215,34224,34242,34260
                return "Growing";
            }
            if (value == 18)
            {
                // Redwood tree[Clear,Inspect,Guide] 34278
                return "Checked";
            }
            if (value >= 19 && value <= 27)
            {
                // Diseased Redwood tree[Prune,Inspect,Guide] 34130,34131,34132,34133,34134,34139,34148,34166,34184
                return "Diseased";
            }
            if (value >= 28 && value <= 36)
            {
                // Dead Redwood tree[Clear,Inspect,Guide] 34061,34062,34063,34064,34065,34070,34079,34097,34115
                return "Dead";
            }
            if (value == 37)
            {
                // Redwood tree[Check-health,Inspect,Guide] 34297
                return "Completed";
            }
            if (value >= 41 && value <= 55)
            {
                // Redwood tree[Clear,Inspect,Guide] 34278,34278,34278,34278,34278,34278,34278,34278,34278,34278,34278,34278,34278,34278,34278
                return "Checked";
            }
            return "-";
        }
    },

    FRUIT_TREE("Fruit tree", Varbits.FARMING_7909) {
        @Override
        public String forVarbitValue(int value) {
            if (value >= 0 && value <= 3)
            {
                // Fruit Tree Patch[Rake,Inspect,Guide] 8050,8049,8048,8047
                return "Empty";
            }
            if (value >= 4 && value <= 7)
            {
                // Fruit Tree Patch[Rake,Inspect,Guide] 8050,8050,8050,8050
                return "Empty";
            }
            if (value >= 8 && value <= 13)
            {
                // Apple tree[Inspect,Guide] 7935,7936,7937,7938,7939,7940
                return "Growing";
            }
            if (value >= 14 && value <= 20)
            {
                // Apple tree[Chop-down,Inspect,Guide,Pick-apple] 7941,7942,7943,7944,7945,7946,7947
                return "Checked";
            }
            if (value >= 21 && value <= 26)
            {
                // Diseased apple tree[Prune,Inspect,Guide] 7949,7950,7951,7952,7953,7954
                return "Diseased";
            }
            if (value >= 27 && value <= 32)
            {
                // Dead apple tree[Clear,Inspect,Guide] 7955,7956,7957,7958,7959,7960
                return "Dead";
            }
            if (value == 33)
            {
                // Apple tree stump[Clear,Inspect,Guide] 7961
                return "Checked";
            }
            if (value == 34)
            {
                // Apple tree[Check-health,Inspect,Guide] 7948
                return "Completed";
            }
            if (value >= 35 && value <= 40)
            {
                // Banana tree[Inspect,Guide] 7993,7994,7995,7996,7997,7998
                return "Growing";
            }
            if (value >= 41 && value <= 47)
            {
                // Banana tree[Chop-down,Inspect,Guide,Pick-banana] 8000,8001,8002,8003,8004,8005,8006
                return "Checked";
            }
            if (value >= 48 && value <= 53)
            {
                // Diseased banana tree[Prune,Inspect,Guide] 8007,8008,8009,8010,8011,8012
                return "Diseased";
            }
            if (value >= 54 && value <= 59)
            {
                // Dead banana tree[Clear,Inspect,Guide] 8013,8014,8015,8016,8017,8018
                return "Dead";
            }
            if (value == 60)
            {
                // Banana tree stump[Clear,Inspect,Guide] 8019
                return "Checked";
            }
            if (value == 61)
            {
                // Banana tree[Check-health,Inspect,Guide] 7999
                return "Completed";
            }
            if (value >= 62 && value <= 71)
            {
                // Fruit Tree Patch[Rake,Inspect,Guide] 8050,8050,8050,8050,8050,8050,8050,8050,8050,8050
                return "Empty";
            }
            if (value >= 72 && value <= 77)
            {
                // Orange tree[Inspect,Guide] 8051,8052,8053,8054,8055,8056
                return "Growing";
            }
            if (value >= 78 && value <= 84)
            {
                // Orange tree[Chop-down,Inspect,Guide,Pick-orange] 8057,8058,8059,8060,8061,8062,8063
                return "Checked";
            }
            if (value >= 85 && value <= 89)
            {
                // Diseased orange tree[Prune,Inspect,Guide] 8065,8066,8067,8068,8069
                return "Diseased";
            }
            if (value == 90)
            {
                // Diseased orange tree[Chop-down,Inspect,Guide] 8070
                return "Diseased";
            }
            if (value >= 91 && value <= 96)
            {
                // Dead orange tree[Clear,Inspect,Guide] 8071,8072,8073,8074,8075,8076
                return "Dead";
            }
            if (value == 97)
            {
                // Orange tree stump[Clear,Inspect,Guide] 8077
                return "Checked";
            }
            if (value == 98)
            {
                // Orange tree[Check-health,Inspect,Guide] 8064
                return "Completed";
            }
            if (value >= 99 && value <= 104)
            {
                // Curry tree[Inspect,Guide] 8020,8021,8022,8023,8024,8025
                return "Growing";
            }
            if (value >= 105 && value <= 111)
            {
                // Curry tree[Chop-down,Inspect,Guide,Pick-leaf] 8026,8027,8028,8029,8030,8031,8032
                return "Checked";
            }
            if (value >= 112 && value <= 117)
            {
                // Diseased curry tree[Prune,Inspect,Guide] 8034,8035,8036,8037,8038,8039
                return "Diseased";
            }
            if (value >= 118 && value <= 123)
            {
                // Dead curry tree[Clear,Inspect,Guide] 8040,8041,8042,8043,8044,8045
                return "Dead";
            }
            if (value == 124)
            {
                // Curry tree stump[Clear,Inspect,Guide] 8046
                return "Checked";
            }
            if (value == 125)
            {
                // Curry tree[Check-health,Inspect,Guide] 8033
                return "Completed";
            }
            if (value >= 126 && value <= 135)
            {
                // Fruit Tree Patch[Rake,Inspect,Guide] 8050,8050,8050,8050,8050,8050,8050,8050,8050,8050
                return "Empty";
            }
            if (value >= 136 && value <= 141)
            {
                // Pineapple plant[Inspect,Guide] 7966,7967,7968,7969,7970,7971
                return "Growing";
            }
            if (value >= 142 && value <= 148)
            {
                // Pineapple plant[Chop down,Inspect,Guide,Pick-pineapple] 7972,7973,7974,7975,7976,7977,7978
                return "Checked";
            }
            if (value >= 149 && value <= 154)
            {
                // Diseased pineapple plant[Prune,Inspect,Guide] 7980,7981,7982,7983,7984,7985
                return "Diseased";
            }
            if (value >= 155 && value <= 160)
            {
                // Dead pineapple plant[Clear,Inspect,Guide] 7986,7987,7988,7989,7990,7991
                return "Dead";
            }
            if (value == 161)
            {
                // Pineapple plant stump[Clear,Inspect,Guide] 7992
                return "Checked";
            }
            if (value == 162)
            {
                // Pineapple plant[Check-health,Inspect,Guide] 7979
                return "Completed";
            }
            if (value >= 163 && value <= 168)
            {
                // Papaya tree[Inspect,Guide] 8105,8106,8107,8108,8109,8110
                return "Growing";
            }
            if (value >= 169 && value <= 175)
            {
                // Papaya tree[Chop-down,Inspect,Guide,Pick-fruit] 8111,8112,8113,8114,8115,8116,8117
                return "Checked";
            }
            if (value >= 176 && value <= 181)
            {
                // Diseased papaya tree[Prune,Inspect,Guide] 8119,8120,8121,8122,8123,8124
                return "Diseased";
            }
            if (value >= 182 && value <= 187)
            {
                // Dead papaya tree[Clear,Inspect,Guide] 8125,8126,8127,8128,8129,8130
                return "Dead";
            }
            if (value == 188)
            {
                // Papaya tree stump[Clear,Inspect,Guide] 8131
                return "Checked";
            }
            if (value == 189)
            {
                // Papaya tree[Check-health,Inspect,Guide] 8118
                return "Completed";
            }
            if (value >= 190 && value <= 199)
            {
                // Fruit Tree Patch[Rake,Inspect,Guide] 8050,8050,8050,8050,8050,8050,8050,8050,8050,8050
                return "Empty";
            }
            if (value >= 200 && value <= 205)
            {
                // Palm tree[Inspect,Guide] 8078,8079,8080,8081,8082,8083
                return "Growing";
            }
            if (value >= 206 && value <= 212)
            {
                // Palm tree[Chop-down,Inspect,Guide,Pick-coconut] 8084,8085,8086,8087,8088,8089,8090
                return "Checked";
            }
            if (value >= 213 && value <= 218)
            {
                // Diseased palm tree[Prune,Inspect,Guide] 8092,8093,8094,8095,8096,8097
                return "Diseased";
            }
            if (value >= 219 && value <= 224)
            {
                // Dead palm tree[Clear,Inspect,Guide] 8098,8099,8100,8101,8102,8103
                return "Dead";
            }
            if (value == 225)
            {
                // Palm tree stump[Clear,Inspect,Guide] 8104
                return "Checked";
            }
            if (value == 226)
            {
                // Palm tree[Check-health,Inspect,Guide] 8091
                return "Completed";
            }
            if (value >= 227 && value <= 232)
            {
                // Dragonfruit tree[Inspect,Guide] 34008,34009,34010,34011,34012,34013
                return "Growing";
            }
            if (value >= 233 && value <= 239)
            {
                // Dragonfruit tree[Chop down,Inspect,Guide,Pick-dragonfruit] 34014,34015,34016,34017,34018,34019,34020
                return "Checked";
            }
            if (value >= 240 && value <= 245)
            {
                // Diseased dragonfruit plant[Prune,Inspect,Guide] 34022,34023,34024,34025,34026,34027
                return "Diseased";
            }
            if (value >= 246 && value <= 251)
            {
                // Dead dragonfruit plant[Clear,Inspect,Guide] 34028,34029,34030,34031,34032,34033
                return "Dead";
            }
            if (value == 252)
            {
                // Dragonfruit tree stump[Clear,Inspect,Guide] 34034
                return "Checked";
            }
            if (value == 253)
            {
                // Dragonfruit tree[Check-health,Inspect,Guide] 34021
                return "Completed";
            }
            if (value >= 254 && value <= 255)
            {
                // Fruit Tree Patch[Rake,Inspect,Guide] 8050,8050
                return "Empty";
            }
            return "-";
        }
    },

    CELASTRUS("Celastrus", Varbits.FARMING_7910) {
        @Override
        public String forVarbitValue(int value) {
            if (value >= 0 && value <= 3)
            {
                // Celastrus patch[Rake,Inspect,Guide] 33698,33697,33696,33695
                return "Empty";
            }
            if (value >= 4 && value <= 7)
            {
                // Celastrus patch[Rake,Inspect,Guide] 33698,33698,33698,33698
                return "Empty";
            }
            if (value >= 8 && value <= 12)
            {
                // Celastrus tree[Inspect,Guide] 33699,33700,33701,33702,33703
                return "Growing";
            }
            if (value == 13)
            {
                // Celastrus tree[Check-health,Inspect,Guide] 33704
                return "Completed";
            }
            if (value >= 14 && value <= 16)
            {
                // Celastrus tree[Harvest,Inspect,Guide] 33719,33718,33717
                return "Checked";
            }
            if (value == 17)
            {
                // Harvested Celastrus tree[Chop,Inspect,Guide] 33720
                return "Checked";
            }
            if (value >= 18 && value <= 22)
            {
                // Diseased celastrus tree[Prune,Inspect,Guide] 33705,33706,33707,33708,33709
                return "Diseased";
            }
            if (value >= 23 && value <= 27)
            {
                // Dead celastrus tree[Clear,Inspect,Guide] 33711,33712,33713,33714,33715
                return "Dead";
            }
            if (value == 28)
            {
                // Celastrus tree stump[Clear,Inspect,Guide] 33721
                return "Checked";
            }
            if (value >= 29 && value <= 255)
            {
                // Celastrus patch[Rake,Inspect,Guide] 33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698,33698
                return "Empty";
            }
            return "-";
        }
    },

    TREE("Tree", Varbits.FARMING_7905) {
        @Override
        public String forVarbitValue(int value) {
            if (value >= 0 && value <= 3)
            {
                // Tree patch[Rake,Inspect,Guide] 8395,8394,8393,8392
                return "Empty";
            }
            if (value >= 4 && value <= 7)
            {
                // Tree patch[Rake,Inspect,Guide] 8395,8395,8395,8395
                return "Empty";
            }
            if (value >= 8 && value <= 11)
            {
                // Oak[Inspect,Guide] 8462,8463,8464,8465
                return "Growing";
            }
            if (value == 12)
            {
                // Oak[Check-health,Inspect,Guide] 8466
                return "Completed";
            }
            if (value == 13)
            {
                // Oak[Chop down,Inspect,Guide] 8467
                return "Checked";
            }
            if (value == 14)
            {
                // Oak tree stump[Clear,Inspect,Guide] 8468
                return "Checked";
            }
            if (value >= 15 && value <= 20)
            {
                // Willow Tree[Inspect,Guide] 8481,8482,8483,8484,8485,8486
                return "Growing";
            }
            if (value == 21)
            {
                // Willow Tree[Check-health,Inspect,Guide] 8487
                return "Completed";
            }
            if (value == 22)
            {
                // Willow Tree[Chop down,Inspect,Guide] 8488
                return "Checked";
            }
            if (value == 23)
            {
                // Willow tree stump[Clear,Inspect,Guide] 8489
                return "Checked";
            }
            if (value >= 24 && value <= 31)
            {
                // Maple Tree[Inspect,Guide] 8435,8436,8437,8438,8439,8440,8441,8442
                return "Growing";
            }
            if (value == 32)
            {
                // Maple Tree[Check-health,Inspect,Guide] 8443
                return "Completed";
            }
            if (value == 33)
            {
                // Maple Tree[Chop down,Inspect,Guide] 8444
                return "Checked";
            }
            if (value == 34)
            {
                // Tree stump[Clear,Inspect,Guide] 8445
                return "Checked";
            }
            if (value >= 35 && value <= 44)
            {
                // Yew sapling,Yew tree[Inspect,Guide] 8502,8503,8504,8505,8506,8507,8508,8509,8510,8511
                return "Growing";
            }
            if (value == 45)
            {
                // Yew tree[Check-health,Inspect,Guide] 8512
                return "Completed";
            }
            if (value == 46)
            {
                // Yew tree[Chop down,Inspect,Guide] 8513
                return "Checked";
            }
            if (value == 47)
            {
                // Yew tree stump[Clear,Inspect,Guide] 8514
                return "Checked";
            }
            if (value >= 48 && value <= 59)
            {
                // Magic Tree[Inspect,Guide] 8396,8397,8398,8399,8400,8401,8402,8403,8404,8405,8406,8407
                return "Growing";
            }
            if (value == 60)
            {
                // Magic Tree[Check-health,Inspect,Guide] 8408
                return "Completed";
            }
            if (value == 61)
            {
                // Magic Tree[Chop down,Inspect,Guide] 8409
                return "Checked";
            }
            if (value == 62)
            {
                // Magic Tree Stump[Clear,Inspect,Guide] 8410
                return "Checked";
            }
            if (value >= 63 && value <= 72)
            {
                // Tree patch[Rake,Inspect,Guide] 8395,8395,8395,8395,8395,8395,8395,8395,8395,8395
                return "Empty";
            }
            if (value >= 73 && value <= 75)
            {
                // Diseased Oak[Prune,Inspect,Guide] 8473,8474,8475
                return "Diseased";
            }
            if (value == 77)
            {
                // Diseased Oak[Prune,Inspect,Guide] 8476
                return "Diseased";
            }
            if (value >= 78 && value <= 79)
            {
                // Tree patch[Rake,Inspect,Guide] 8395,8395
                return "Empty";
            }
            if (value >= 80 && value <= 84)
            {
                // Diseased Willow[Prune,Inspect,Guide] 8490,8491,8492,8493,8494
                return "Diseased";
            }
            if (value == 86)
            {
                // Diseased Willow[Prune,Inspect,Guide] 8495
                return "Diseased";
            }
            if (value >= 87 && value <= 88)
            {
                // Tree patch[Rake,Inspect,Guide] 8395,8395
                return "Empty";
            }
            if (value >= 89 && value <= 95)
            {
                // Diseased Maple[Prune,Inspect,Guide] 8446,8447,8448,8449,8450,8451,8452
                return "Diseased";
            }
            if (value == 97)
            {
                // Diseased Maple[Prune,Inspect,Guide] 8453
                return "Diseased";
            }
            if (value >= 98 && value <= 99)
            {
                // Tree patch[Rake,Inspect,Guide] 8395,8395
                return "Empty";
            }
            if (value >= 100 && value <= 108)
            {
                // Diseased Yew[Prune,Inspect,Guide] 8515,8516,8517,8518,8519,8520,8521,8522,8523
                return "Diseased";
            }
            if (value == 110)
            {
                // Diseased Yew[Prune,Inspect,Guide] 8524
                return "Diseased";
            }
            if (value >= 111 && value <= 112)
            {
                // Tree patch[Rake,Inspect,Guide] 8395,8395
                return "Empty";
            }
            if (value >= 113 && value <= 123)
            {
                // Diseased Magic Tree[Prune,Inspect,Guide] 8411,8412,8413,8414,8415,8416,8417,8418,8419,8420,8421
                return "Diseased";
            }
            if (value == 125)
            {
                // Diseased Magic Tree[Prune,Inspect,Guide] 8422
                return "Diseased";
            }
            if (value >= 126 && value <= 136)
            {
                // Tree patch[Rake,Inspect,Guide] 8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395
                return "Empty";
            }
            if (value >= 137 && value <= 139)
            {
                // Dead Oak[Clear,Inspect,Guide] 8477,8478,8479
                return "Dead";
            }
            if (value == 141)
            {
                // Dead Oak[Clear,Inspect,Guide] 8480
                return "Dead";
            }
            if (value >= 142 && value <= 143)
            {
                // Tree patch[Rake,Inspect,Guide] 8395,8395
                return "Empty";
            }
            if (value >= 144 && value <= 148)
            {
                // Dead Willow[Clear,Inspect,Guide] 8496,8497,8498,8499,8500
                return "Dead";
            }
            if (value == 150)
            {
                // Dead Willow[Clear,Inspect,Guide] 8501
                return "Dead";
            }
            if (value >= 151 && value <= 152)
            {
                // Tree patch[Rake,Inspect,Guide] 8395,8395
                return "Empty";
            }
            if (value >= 153 && value <= 159)
            {
                // Dead Maple[Clear,Inspect,Guide] 8454,8455,8456,8457,8458,8459,8460
                return "Dead";
            }
            if (value == 161)
            {
                // Dead Maple[Clear,Inspect,Guide] 8461
                return "Dead";
            }
            if (value >= 162 && value <= 163)
            {
                // Tree patch[Rake,Inspect,Guide] 8395,8395
                return "Empty";
            }
            if (value >= 164 && value <= 172)
            {
                // Dead Yew[Clear,Inspect,Guide] 8525,8526,8527,8528,8529,8530,8531,8532,8533
                return "Dead";
            }
            if (value == 174)
            {
                // Dead Yew[Clear,Inspect,Guide] 8534
                return "Dead";
            }
            if (value >= 175 && value <= 176)
            {
                // Tree patch[Rake,Inspect,Guide] 8395,8395
                return "Empty";
            }
            if (value >= 177 && value <= 187)
            {
                // Dead Magic Tree[Clear,Inspect,Guide] 8423,8424,8425,8426,8427,8428,8429,8430,8431,8432,8433
                return "Dead";
            }
            if (value == 189)
            {
                // Dead Magic Tree[Clear,Inspect,Guide] 8434
                return "Dead";
            }
            if (value >= 190 && value <= 191)
            {
                // Tree patch[Rake,Inspect,Guide] 8395,8395
                return "Empty";
            }
            if (value >= 192 && value <= 197)
            {
                // Willow Tree[Chop down,Inspect,Guide] 8488,8488,8488,8488,8488,8488
                return "Checked";
            }
            if (value >= 198 && value <= 255)
            {
                // Tree patch[Rake,Inspect,Guide] 8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395,8395
                return "Empty";
            }
            return "-";
        }
    },

    HERB("Herb", Varbits.FARMING_4775) {
        @Override
        public String forVarbitValue(int value) {
            if (value >= 0 && value <= 3)
            {
                // Herb patch[Rake,Inspect,Guide] 8135,8134,8133,8132
                return "Empty";
            }
            if (value >= 4 && value <= 7)
            {
                // Herbs[Inspect,Guide] 14209,26825,26826,26827
                return "Growing";
            }
            if (value >= 8 && value <= 10)
            {
                // Herbs[Pick,Inspect,Guide] 26828,26828,26828
                return "Completed";
            }
            if (value >= 11 && value <= 14)
            {
                // Herbs[Inspect,Guide] 26829,39748,39749,39750
                return "Growing";
            }
            if (value >= 15 && value <= 17)
            {
                // Herbs[Pick,Inspect,Guide] 39751,39751,39751
                return "Completed";
            }
            if (value >= 18 && value <= 21)
            {
                // Herbs[Inspect,Guide] 39752,39753,39754,39755
                return "Growing";
            }
            if (value >= 22 && value <= 24)
            {
                // Herbs[Pick,Inspect,Guide] 39756,39756,39756
                return "Completed";
            }
            if (value >= 25 && value <= 28)
            {
                // Herbs[Inspect,Guide] 39757,39758,39759,39760
                return "Growing";
            }
            if (value >= 29 && value <= 31)
            {
                // Herbs[Pick,Inspect,Guide] 39761,39761,39761
                return "Completed";
            }
            if (value >= 32 && value <= 35)
            {
                // Herbs[Inspect,Guide] 39762,39763,39764,39765
                return "Growing";
            }
            if (value >= 36 && value <= 38)
            {
                // Herbs[Pick,Inspect,Guide] 39766,39766,39766
                return "Completed";
            }
            if (value >= 39 && value <= 42)
            {
                // Herbs[Inspect,Guide] 39777,39778,39779,39780
                return "Growing";
            }
            if (value >= 43 && value <= 45)
            {
                // Herbs[Pick,Inspect,Guide] 39781,39781,39781
                return "Completed";
            }
            if (value >= 46 && value <= 49)
            {
                // Herbs[Inspect,Guide] 39767,39768,39769,39770
                return "Growing";
            }
            if (value >= 50 && value <= 52)
            {
                // Herbs[Pick,Inspect,Guide] 39771,39771,39771
                return "Completed";
            }
            if (value >= 53 && value <= 56)
            {
                // Herbs[Inspect,Guide] 39772,39773,39774,39775
                return "Growing";
            }
            if (value >= 57 && value <= 59)
            {
                // Herbs[Pick,Inspect,Guide] 39776,39776,39776
                return "Completed";
            }
            if (value >= 60 && value <= 63)
            {
                // Herbs[Inspect,Guide] 55347,55348,55349,55350
                return "Growing";
            }
            if (value >= 64 && value <= 66)
            {
                // Herbs[Pick,Inspect,Guide] 55351,55351,55351
                return "Completed";
            }
            if (value == 67)
            {
                // Herb patch[Rake,Inspect,Guide] 8135
                return "Empty";
            }
            if (value >= 68 && value <= 71)
            {
                // Herbs[Inspect,Guide] 39782,39783,39784,39785
                return "Growing";
            }
            if (value >= 72 && value <= 74)
            {
                // Herbs[Pick,Inspect,Guide] 39786,39786,39786
                return "Completed";
            }
            if (value >= 75 && value <= 78)
            {
                // Herbs[Inspect,Guide] 39807,39808,39809,39810
                return "Growing";
            }
            if (value >= 79 && value <= 81)
            {
                // Herbs[Pick,Inspect,Guide] 39811,39811,39811
                return "Completed";
            }
            if (value >= 82 && value <= 85)
            {
                // Herbs[Inspect,Guide] 39787,39788,39789,39790
                return "Growing";
            }
            if (value >= 86 && value <= 88)
            {
                // Herbs[Pick,Inspect,Guide] 39791,39791,39791
                return "Completed";
            }
            if (value >= 89 && value <= 92)
            {
                // Herbs[Inspect,Guide] 39792,39793,39794,39795
                return "Growing";
            }
            if (value >= 93 && value <= 95)
            {
                // Herbs[Pick,Inspect,Guide] 39796,39796,39796
                return "Completed";
            }
            if (value >= 96 && value <= 99)
            {
                // Herbs[Inspect,Guide] 39797,39798,39799,39800
                return "Growing";
            }
            if (value >= 100 && value <= 102)
            {
                // Herbs[Pick,Inspect,Guide] 39801,39801,39801
                return "Completed";
            }
            if (value >= 103 && value <= 106)
            {
                // Herbs[Inspect,Guide] 39802,39803,39804,39805
                return "Growing";
            }
            if (value >= 107 && value <= 109)
            {
                // Herbs[Pick,Inspect,Guide] 39806,39806,39806
                return "Completed";
            }
            if (value >= 128 && value <= 130)
            {
                // Diseased herbs[Cure,Inspect,Guide] 8144,8145,8146
                return "Diseased";
            }
            if (value >= 131 && value <= 133)
            {
                // Diseased herbs[Cure,Inspect,Guide] 8144,8145,8146
                return "Diseased";
            }
            if (value >= 134 && value <= 136)
            {
                // Diseased herbs[Cure,Inspect,Guide] 8144,8145,8146
                return "Diseased";
            }
            if (value >= 137 && value <= 139)
            {
                // Diseased herbs[Cure,Inspect,Guide] 8144,8145,8146
                return "Diseased";
            }
            if (value >= 140 && value <= 142)
            {
                // Diseased herbs[Cure,Inspect,Guide] 8144,8145,8146
                return "Diseased";
            }
            if (value >= 143 && value <= 145)
            {
                // Diseased herbs[Cure,Inspect,Guide] 8144,8145,8146
                return "Diseased";
            }
            if (value >= 146 && value <= 148)
            {
                // Diseased herbs[Cure,Inspect,Guide] 8144,8145,8146
                return "Diseased";
            }
            if (value >= 149 && value <= 151)
            {
                // Diseased herbs[Cure,Inspect,Guide] 8144,8145,8146
                return "Diseased";
            }
            if (value >= 152 && value <= 154)
            {
                // Diseased herbs[Cure,Inspect,Guide] 8144,8145,8146
                return "Diseased";
            }
            if (value >= 155 && value <= 157)
            {
                // Diseased herbs[Cure,Inspect,Guide] 8144,8145,8146
                return "Diseased";
            }
            if (value >= 158 && value <= 160)
            {
                // Diseased herbs[Cure,Inspect,Guide] 8144,8145,8146
                return "Diseased";
            }
            if (value >= 161 && value <= 163)
            {
                // Diseased herbs[Cure,Inspect,Guide] 8144,8145,8146
                return "Diseased";
            }
            if (value >= 164 && value <= 166)
            {
                // Diseased herbs[Cure,Inspect,Guide] 8144,8145,8146
                return "Diseased";
            }
            if (value >= 167 && value <= 169)
            {
                // Diseased herbs[Cure,Inspect,Guide] 8144,8145,8146
                return "Diseased";
            }
            if (value >= 170 && value <= 172)
            {
                // Dead herbs[Clear,Inspect,Guide] 8147,8148,8149
                return "Dead";
            }
            if (value >= 173 && value <= 175)
            {
                // Diseased herbs[Cure,Inspect,Guide] 8144,8145,8146
                return "Diseased";
            }
            if (value >= 176 && value <= 191)
            {
                // Herb patch[Rake,Inspect,Guide] 8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135
                return "Empty";
            }
            if (value >= 192 && value <= 195)
            {
                // Goutweed[Inspect,Guide] 9044,9045,9046,9047
                return "Growing";
            }
            if (value >= 196 && value <= 197)
            {
                // Goutweed[Pick,Inspect,Guide] 9048,9048
                return "Completed";
            }
            if (value >= 198 && value <= 200)
            {
                // Diseased goutweed[Cure,Inspect,Guide] 9049,9050,9051
                return "Diseased";
            }
            if (value >= 201 && value <= 203)
            {
                // Dead goutweed[Clear,Inspect,Guide] 9052,9053,9054
                return "Dead";
            }
            if (value >= 204 && value <= 219)
            {
                // Herb patch[Rake,Inspect,Guide] 8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135
                return "Empty";
            }
            if (value >= 221 && value <= 255)
            {
                // Herb patch[Rake,Inspect,Guide] 8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135,8135
                return "Empty";
            }
            return "-";
        }
    },

    CACTUS("Cactus", Varbits.FARMING_7904) {
        @Override
        public String forVarbitValue(int value) {
            if (value >= 0 && value <= 3)
            {
                // Cactus patch[Rake,Inspect,Guide] 7746,7745,7744,7743
                return "Empty";
            }
            if (value >= 4 && value <= 7)
            {
                // Cactus patch[Rake,Inspect,Guide] 7746,7746,7746,7746
                return "Empty";
            }
            if (value >= 8 && value <= 14)
            {
                // Cactus[Inspect,Guide] 7747,7748,7749,7750,7751,7752,7753
                return "Growing";
            }
            if (value >= 15 && value <= 18)
            {
                // Cactus[Clear,Inspect,Guide,Pick-spine] 7754,7757,7757,7757
                return "Checked";
            }
            if (value >= 19 && value <= 24)
            {
                // Diseased cactus[Cure,Inspect,Guide] 7759,7760,7761,7762,7763,7764
                return "Diseased";
            }
            if (value >= 25 && value <= 30)
            {
                // Dead cactus[Clear,Inspect,Guide] 7765,7766,7767,7768,7769,7770
                return "Dead";
            }
            if (value == 31)
            {
                // Cactus[Check-health,Inspect,Guide] 7758
                return "Completed";
            }
            if (value >= 32 && value <= 38)
            {
                // Potato cactus[Inspect,Guide] 33734,33735,33736,33737,33738,33739,33740
                return "Growing";
            }
            if (value >= 39 && value <= 45)
            {
                // Potato cactus[Clear,Inspect,Guide,Pick] 33741,33742,33743,33744,33745,33746,33747
                return "Checked";
            }
            if (value >= 46 && value <= 51)
            {
                // Diseased Potato cactus[Cure,Inspect,Guide] 33749,33750,33751,33752,33753,33754
                return "Diseased";
            }
            if (value >= 52 && value <= 57)
            {
                // Dead Potato cactus[Clear,Inspect,Guide] 33755,33756,33757,33758,33759,33760
                return "Dead";
            }
            if (value == 58)
            {
                // Potato cactus[Check-health,Inspect,Guide] 33748
                return "Completed";
            }
            if (value >= 59 && value <= 255)
            {
                // Cactus patch[Rake,Inspect,Guide] 7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746,7746
                return "Empty";
            }
            return "-";
        }
    },

    ALLOTMENT_NORTH("Allotment north", Varbits.FARMING_4773) {
        @Override
        public String forVarbitValue(int value) {
            return allotmentValue(value);
        }
    },

    ALLOTMENT_SOUTH("Allotment south", Varbits.FARMING_4774) {
        @Override
        public String forVarbitValue(int value) {
            return allotmentValue(value);
        }
    },

    BUSH("Bush", Varbits.FARMING_4772) {
        @Override
        public String forVarbitValue(int value) {
            if (value >= 0 && value <= 3)
            {
                // Bush Patch[Rake,Inspect,Guide] 7576,7575,7574,7573
                return "Empty";
            }
            if (value == 4)
            {
                // Bush Patch[Rake,Inspect,Guide] 7576
                return "Empty";
            }
            if (value >= 5 && value <= 9)
            {
                // Redberry bush[Inspect,Guide] 7692,7693,7694,7695,7696
                return "Growing";
            }
            if (value >= 10 && value <= 14)
            {
                // Redberry bush[Clear,Inspect,Guide,Pick-from] 7697,7701,7701,7701,7701
                return "Checked";
            }
            if (value >= 15 && value <= 20)
            {
                // Cadavaberry bush[Inspect,Guide] 7581,7582,7583,7584,7585,7586
                return "Growing";
            }
            if (value >= 21 && value <= 25)
            {
                // Cadavaberry bush[Clear,Inspect,Guide,Pick-from] 7587,7591,7591,7591,7591
                return "Checked";
            }
            if (value >= 26 && value <= 32)
            {
                // Dwellberry bush[Inspect,Guide] 7605,7606,7607,7608,7609,7610,7611
                return "Growing";
            }
            if (value >= 33 && value <= 37)
            {
                // Dwellberry bush[Clear,Inspect,Guide,Pick-from] 7612,7616,7616,7616,7616
                return "Checked";
            }
            if (value >= 38 && value <= 45)
            {
                // Jangerberry bush[Inspect,Guide] 7632,7633,7634,7635,7636,7637,7638,7639
                return "Growing";
            }
            if (value >= 46 && value <= 50)
            {
                // Jangerberry bush[Clear,Inspect,Guide,Pick-from] 7640,7644,7644,7644,7644
                return "Checked";
            }
            if (value >= 51 && value <= 58)
            {
                // Whiteberry bush[Inspect,Guide] 7713,7714,7715,7716,7717,7718,7719,7720
                return "Growing";
            }
            if (value >= 59 && value <= 63)
            {
                // Whiteberry bush[Clear,Inspect,Guide,Pick-from] 7721,7725,7725,7725,7725
                return "Checked";
            }
            if (value >= 64 && value <= 69)
            {
                // Bush Patch[Rake,Inspect,Guide] 7576,7576,7576,7576,7576,7576
                return "Empty";
            }
            if (value >= 70 && value <= 74)
            {
                // Diseased redberry bush[Prune,Inspect,Guide] 7703,7704,7705,7706,7707
                return "Diseased";
            }
            if (value >= 75 && value <= 79)
            {
                // Bush Patch[Rake,Inspect,Guide] 7576,7576,7576,7576,7576
                return "Empty";
            }
            if (value >= 80 && value <= 85)
            {
                // Diseased cadavaberry bush[Prune,Inspect,Guide] 7593,7594,7595,7596,7597,7598
                return "Diseased";
            }
            if (value >= 86 && value <= 90)
            {
                // Bush Patch[Rake,Inspect,Guide] 7576,7576,7576,7576,7576
                return "Empty";
            }
            if (value >= 91 && value <= 97)
            {
                // Diseased dwellberry bush[Prune,Inspect,Guide] 7618,7619,7620,7621,7622,7623,7624
                return "Diseased";
            }
            if (value >= 98 && value <= 102)
            {
                // Bush Patch[Rake,Inspect,Guide] 7576,7576,7576,7576,7576
                return "Empty";
            }
            if (value >= 103 && value <= 110)
            {
                // Diseased jangerberry bush[Prune,Inspect,Guide] 7646,7647,7648,7649,7650,7651,7652,7653
                return "Diseased";
            }
            if (value >= 111 && value <= 115)
            {
                // Bush Patch[Rake,Inspect,Guide] 7576,7576,7576,7576,7576
                return "Empty";
            }
            if (value >= 116 && value <= 123)
            {
                // Diseased whiteberry bush[Prune,Inspect,Guide] 7727,7728,7729,7730,7731,7732,7733,7734
                return "Diseased";
            }
            if (value >= 124 && value <= 133)
            {
                // Bush Patch[Rake,Inspect,Guide] 7576,7576,7576,7576,7576,7576,7576,7576,7576,7576
                return "Empty";
            }
            if (value >= 134 && value <= 138)
            {
                // Dead redberry bush[Clear,Inspect,Guide] 7708,7709,7710,7711,7712
                return "Dead";
            }
            if (value >= 139 && value <= 143)
            {
                // Bush Patch[Rake,Inspect,Guide] 7576,7576,7576,7576,7576
                return "Empty";
            }
            if (value >= 144 && value <= 149)
            {
                // Dead cadavaberry bush[Clear,Inspect,Guide] 7599,7600,7601,7602,7603,7604
                return "Dead";
            }
            if (value >= 150 && value <= 154)
            {
                // Bush Patch[Rake,Inspect,Guide] 7576,7576,7576,7576,7576
                return "Empty";
            }
            if (value >= 155 && value <= 161)
            {
                // Dead dwellberry bush[Clear,Inspect,Guide] 7625,7626,7627,7628,7629,7630,7631
                return "Dead";
            }
            if (value >= 162 && value <= 166)
            {
                // Bush Patch[Rake,Inspect,Guide] 7576,7576,7576,7576,7576
                return "Empty";
            }
            if (value >= 167 && value <= 174)
            {
                // Dead jangerberry bush[Clear,Inspect,Guide] 7654,7655,7656,7657,7658,7659,7660,7661
                return "Dead";
            }
            if (value >= 175 && value <= 179)
            {
                // Bush Patch[Rake,Inspect,Guide] 7576,7576,7576,7576,7576
                return "Empty";
            }
            if (value >= 180 && value <= 187)
            {
                // Dead whiteberry bush[Clear,Inspect,Guide] 7735,7736,7737,7738,7739,7740,7741,7742
                return "Dead";
            }
            if (value >= 188 && value <= 196)
            {
                // Bush Patch[Rake,Inspect,Guide] 7576,7576,7576,7576,7576,7576,7576,7576,7576
                return "Empty";
            }
            if (value >= 197 && value <= 204)
            {
                // Poison Ivy bush[Inspect,Guide] 7662,7663,7664,7665,7666,7667,7668,7669
                return "Growing";
            }
            if (value >= 205 && value <= 209)
            {
                // Poison Ivy bush[Clear,Inspect,Guide,Pick-from] 7670,7674,7674,7674,7674
                return "Checked";
            }
            if (value >= 210 && value <= 216)
            {
                // Diseased Poison Ivy bush[Prune,Inspect,Guide] 7676,7677,7678,7679,7680,7681,7682
                return "Diseased";
            }
            if (value >= 217 && value <= 224)
            {
                // Dead Poison Ivy bush[Clear,Inspect,Guide] 7684,7685,7686,7687,7688,7689,7690,7691
                return "Dead";
            }
            if (value == 225)
            {
                // Diseased Poison Ivy bush[Prune,Inspect,Guide] 7683
                return "Diseased";
            }
            if (value >= 226 && value <= 249)
            {
                // Bush Patch[Rake,Inspect,Guide] 7576,7576,7576,7576,7576,7576,7576,7576,7576,7576,7576,7576,7576,7576,7576,7576,7576,7576,7576,7576,7576,7576,7576,7576
                return "Empty";
            }
            if (value == 250)
            {
                // Redberry bush[Check-health,Inspect,Guide] 7702
                return "Completed";
            }
            if (value == 251)
            {
                // Cadavaberry bush[Check-health,Inspect,Guide] 7592
                return "Completed";
            }
            if (value == 252)
            {
                // Dwellberry bush[Check-health,Inspect,Guide] 7617
                return "Completed";
            }
            if (value == 253)
            {
                // Jangerberry bush[Check-health,Inspect,Guide] 7645
                return "Completed";
            }
            if (value == 254)
            {
                // Whiteberry bush[Check-health,Inspect,Guide] 7726
                return "Completed";
            }
            if (value == 255)
            {
                // Poison Ivy bush[Check-health,Inspect,Guide] 7675
                return "Completed";
            }
            return "-";
        }
    },

    FLOWER("Flower", Varbits.FARMING_7906) {
        @Override
        public String forVarbitValue(int value) {
            if (value >= 0 && value <= 3)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843,7842,7841,7840
                return "Empty";
            }
            if (value >= 4 && value <= 7)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843,7843,7843,7843
                return "Empty";
            }
            if (value >= 8 && value <= 11)
            {
                // Marigold[Inspect,Guide] 7867,7868,7869,7870
                return "Growing";
            }
            if (value == 12)
            {
                // Marigold[Pick,Inspect,Guide] 7871
                return "Completed";
            }
            if (value >= 13 && value <= 16)
            {
                // Rosemary[Inspect,Guide] 7899,7900,7901,7902
                return "Growing";
            }
            if (value == 17)
            {
                // Rosemary[Pick,Inspect,Guide] 7903
                return "Completed";
            }
            if (value >= 18 && value <= 21)
            {
                // Nasturtium[Inspect,Guide] 7883,7884,7885,7886
                return "Growing";
            }
            if (value == 22)
            {
                // Nasturtium[Pick,Inspect,Guide] 7887
                return "Completed";
            }
            if (value >= 23 && value <= 26)
            {
                // Woad plant[Inspect,Guide] 7919,7920,7921,7922
                return "Growing";
            }
            if (value == 27)
            {
                // Woad plant[Pick,Inspect,Guide] 7923
                return "Completed";
            }
            if (value >= 28 && value <= 31)
            {
                // Limpwurt plant[Inspect,Guide] 7851,7852,7853,7854
                return "Growing";
            }
            if (value == 32)
            {
                // Limpwurt plant[Pick,Inspect,Guide] 7855
                return "Completed";
            }
            if (value >= 33 && value <= 35)
            {
                // Scarecrow[Rake,Inspect,Guide,Remove] 7918,7917,7916
                return "Empty";
            }
            if (value == 36)
            {
                // Scarecrow[Remove,Inspect,Guide] 7915
                return "Empty";
            }
            if (value >= 37 && value <= 40)
            {
                // White lily[Inspect,Guide] 33650,33651,33652,33653
                return "Growing";
            }
            if (value == 41)
            {
                // White lily[Pick,Inspect,Guide] 33654
                return "Completed";
            }
            if (value >= 42 && value <= 71)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843
                return "Empty";
            }
            if (value >= 72 && value <= 75)
            {
                // Marigold[Inspect,Guide] 7872,7873,7874,7875
                return "Growing";
            }
            if (value == 76)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843
                return "Empty";
            }
            if (value >= 77 && value <= 80)
            {
                // Rosemary[Inspect,Guide] 7904,7905,7906,7907
                return "Growing";
            }
            if (value == 81)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843
                return "Empty";
            }
            if (value >= 82 && value <= 85)
            {
                // Nasturtium[Inspect,Guide] 7888,7889,7890,7891
                return "Growing";
            }
            if (value == 86)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843
                return "Empty";
            }
            if (value >= 87 && value <= 90)
            {
                // Woad plant[Inspect,Guide] 7924,7925,7926,7927
                return "Growing";
            }
            if (value == 91)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843
                return "Empty";
            }
            if (value >= 92 && value <= 95)
            {
                // Limpwurt plant[Inspect,Guide] 7856,7857,7858,7859
                return "Growing";
            }
            if (value >= 96 && value <= 100)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843,7843,7843,7843,7843
                return "Empty";
            }
            if (value >= 101 && value <= 104)
            {
                // White lily[Inspect,Guide] 33655,33656,33657,33658
                return "Growing";
            }
            if (value >= 105 && value <= 136)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843
                return "Empty";
            }
            if (value >= 137 && value <= 139)
            {
                // Diseased marigold[Cure,Inspect,Guide] 7876,7877,7878
                return "Diseased";
            }
            if (value >= 140 && value <= 141)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843,7843
                return "Empty";
            }
            if (value >= 142 && value <= 144)
            {
                // Diseased rosemary[Cure,Inspect,Guide] 7908,7909,7910
                return "Diseased";
            }
            if (value >= 145 && value <= 146)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843,7843
                return "Empty";
            }
            if (value >= 147 && value <= 149)
            {
                // Diseased nasturtium[Cure,Inspect,Guide] 7892,7893,7894
                return "Diseased";
            }
            if (value >= 150 && value <= 151)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843,7843
                return "Empty";
            }
            if (value >= 152 && value <= 154)
            {
                // Diseased woad plant[Cure,Inspect,Guide] 7928,7929,7930
                return "Diseased";
            }
            if (value >= 155 && value <= 156)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843,7843
                return "Empty";
            }
            if (value >= 157 && value <= 159)
            {
                // Diseased limpwurt plant[Cure,Inspect,Guide] 7860,7861,7862
                return "Diseased";
            }
            if (value >= 160 && value <= 165)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843,7843,7843,7843,7843,7843
                return "Empty";
            }
            if (value >= 166 && value <= 168)
            {
                // Diseased White lily[Cure,Inspect,Guide] 33659,33660,33661
                return "Diseased";
            }
            if (value >= 169 && value <= 200)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843
                return "Empty";
            }
            if (value >= 201 && value <= 204)
            {
                // Dead marigold[Clear,Inspect,Guide] 7879,7880,7881,7882
                return "Dead";
            }
            if (value == 205)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843
                return "Empty";
            }
            if (value >= 206 && value <= 209)
            {
                // Dead rosemary[Clear,Inspect,Guide] 7911,7912,7913,7914
                return "Dead";
            }
            if (value == 210)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843
                return "Empty";
            }
            if (value >= 211 && value <= 214)
            {
                // Dead nasturtium[Clear,Inspect,Guide] 7895,7896,7897,7898
                return "Dead";
            }
            if (value == 215)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843
                return "Empty";
            }
            if (value >= 216 && value <= 219)
            {
                // Dead woad plant[Clear,Inspect,Guide] 7931,7932,7933,7934
                return "Dead";
            }
            if (value == 220)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843
                return "Empty";
            }
            if (value >= 221 && value <= 224)
            {
                // Dead limpwurt plant[Clear,Inspect,Guide] 7863,7864,7865,7866
                return "Dead";
            }
            if (value >= 225 && value <= 229)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843,7843,7843,7843,7843
                return "Empty";
            }
            if (value >= 230 && value <= 233)
            {
                // Dead White lily[Clear,Inspect,Guide] 33662,33663,33664,33665
                return "Dead";
            }
            if (value >= 234 && value <= 255)
            {
                // Flower Patch[Rake,Inspect,Guide] 7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843,7843
                return "Empty";
            }
            return "-";
        }
    };

    public final String name;

    public final int varbit;

    public abstract String forVarbitValue(int value);

    private static String allotmentValue(int value) {
        if (value >= 0 && value <= 3)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8575,8574,8573
            return "Empty";
        }
        if (value >= 4 && value <= 5)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576
            return "Empty";
        }
        if (value >= 6 && value <= 9)
        {
            // Potato seed,Potato plant[Inspect,Guide] 8558,8559,8560,8561
            return "Growing";
        }
        if (value >= 10 && value <= 12)
        {
            // Potato[Harvest,Inspect,Guide] 8562,8562,8562
            return "Completed";
        }
        if (value >= 13 && value <= 16)
        {
            // Onion seeds,Onion plant[Inspect,Guide] 8580,8581,8582,8583
            return "Growing";
        }
        if (value >= 17 && value <= 19)
        {
            // Onion[Harvest,Inspect,Guide] 8584,8584,8584
            return "Completed";
        }
        if (value >= 20 && value <= 23)
        {
            // Cabbages[Inspect,Guide] 8535,8536,8537,8538
            return "Growing";
        }
        if (value >= 24 && value <= 26)
        {
            // Cabbages[Harvest,Inspect,Guide] 8539,8539,8539
            return "Completed";
        }
        if (value >= 27 && value <= 30)
        {
            // Tomato plant[Inspect,Guide] 8641,8642,8643,8644
            return "Growing";
        }
        if (value >= 31 && value <= 33)
        {
            // Tomato[Harvest,Inspect,Guide] 8645,8645,8645
            return "Completed";
        }
        if (value >= 34 && value <= 39)
        {
            // Sweetcorn seed,Sweetcorn plant[Inspect,Guide] 8618,8619,8620,8621,8622,8623
            return "Growing";
        }
        if (value >= 40 && value <= 42)
        {
            // Sweetcorn[Harvest,Inspect,Guide] 8624,8624,8624
            return "Completed";
        }
        if (value >= 43 && value <= 48)
        {
            // Strawberry seed,Strawberry plant[Inspect,Guide] 8595,8596,8597,8598,8599,8600
            return "Growing";
        }
        if (value >= 49 && value <= 51)
        {
            // Strawberry[Harvest,Inspect,Guide] 8601,8601,8601
            return "Completed";
        }
        if (value >= 52 && value <= 59)
        {
            // Watermelon seed,Watermelons[Inspect,Guide] 8656,8657,8658,8659,8660,8661,8662,8663
            return "Growing";
        }
        if (value >= 60 && value <= 62)
        {
            // Watermelon[Harvest,Inspect,Guide] 8664,8664,8664
            return "Completed";
        }
        if (value >= 63 && value <= 69)
        {
            // Snape grass seedling,Snape grass plant[Inspect,Guide] 33674,33675,33676,33677,33678,33679,33680
            return "Growing";
        }
        if (value >= 70 && value <= 73)
        {
            // Potato seed,Potato plant[Inspect,Guide] 8563,8564,8565,8566
            return "Growing";
        }
        if (value >= 74 && value <= 76)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576
            return "Empty";
        }
        if (value >= 77 && value <= 80)
        {
            // Onion seeds,Onion plant[Inspect,Guide] 8585,8586,8587,8588
            return "Growing";
        }
        if (value >= 81 && value <= 83)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576
            return "Empty";
        }
        if (value >= 84 && value <= 87)
        {
            // Cabbages[Inspect,Guide] 8540,8541,8542,8543
            return "Growing";
        }
        if (value >= 88 && value <= 90)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576
            return "Empty";
        }
        if (value >= 91 && value <= 94)
        {
            // Tomato plant[Inspect,Guide] 8646,8647,8648,8649
            return "Growing";
        }
        if (value >= 95 && value <= 97)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576
            return "Empty";
        }
        if (value >= 98 && value <= 103)
        {
            // Sweetcorn seed,Sweetcorn plant[Inspect,Guide] 8625,8626,8627,8628,8629,8630
            return "Growing";
        }
        if (value >= 104 && value <= 106)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576
            return "Empty";
        }
        if (value >= 107 && value <= 112)
        {
            // Strawberry seed,Strawberry plant[Inspect,Guide] 8602,8603,8604,8605,8606,8607
            return "Growing";
        }
        if (value >= 113 && value <= 115)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576
            return "Empty";
        }
        if (value >= 116 && value <= 123)
        {
            // Watermelon seed,Watermelons[Inspect,Guide] 8665,8666,8667,8668,8669,8670,8671,8672
            return "Growing";
        }
        if (value >= 124 && value <= 127)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576,8576
            return "Empty";
        }
        if (value >= 128 && value <= 134)
        {
            // Snape grass seedling,Snape grass plant[Inspect,Guide] 33666,33667,33668,33669,33670,33671,33672
            return "Growing";
        }
        if (value >= 135 && value <= 137)
        {
            // Diseased potatoes[Cure,Inspect,Guide] 8567,8568,8569
            return "Diseased";
        }
        if (value >= 138 && value <= 140)
        {
            // Snape grass plant[Harvest,Inspect,Guide] 33673,33673,33673
            return "Completed";
        }
        if (value == 141)
        {
            // Allotment[Rake,Inspect,Guide] 8576
            return "Empty";
        }
        if (value >= 142 && value <= 144)
        {
            // Diseased onions[Cure,Inspect,Guide] 8589,8590,8591
            return "Diseased";
        }
        if (value >= 145 && value <= 148)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576,8576
            return "Empty";
        }
        if (value >= 149 && value <= 151)
        {
            // Diseased cabbages[Cure,Inspect,Guide] 8544,8545,8546
            return "Diseased";
        }
        if (value >= 152 && value <= 155)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576,8576
            return "Empty";
        }
        if (value >= 156 && value <= 158)
        {
            // Diseased tomato plant[Cure,Inspect,Guide] 8650,8651,8652
            return "Diseased";
        }
        if (value >= 159 && value <= 162)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576,8576
            return "Empty";
        }
        if (value >= 163 && value <= 167)
        {
            // Diseased sweetcorn plant[Cure,Inspect,Guide] 8631,8632,8633,8634,8635
            return "Diseased";
        }
        if (value >= 168 && value <= 171)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576,8576
            return "Empty";
        }
        if (value >= 172 && value <= 176)
        {
            // Diseased strawberry plant[Cure,Inspect,Guide] 8608,8609,8610,8611,8612
            return "Diseased";
        }
        if (value >= 177 && value <= 180)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576,8576
            return "Empty";
        }
        if (value >= 181 && value <= 187)
        {
            // Diseased watermelons[Cure,Inspect,Guide] 8673,8674,8675,8676,8677,8678,8679
            return "Diseased";
        }
        if (value >= 188 && value <= 192)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576,8576,8576
            return "Empty";
        }
        if (value >= 193 && value <= 195)
        {
            // Dead Snape grass[Clear,Inspect,Guide] 33687,33688,33689
            return "Dead";
        }
        if (value >= 196 && value <= 198)
        {
            // Diseased Snape grass[Cure,Inspect,Guide] 33681,33682,33683
            return "Diseased";
        }
        if (value >= 199 && value <= 201)
        {
            // Dead potatoes[Clear,Inspect,Guide] 8570,8571,8572
            return "Dead";
        }
        if (value >= 202 && value <= 204)
        {
            // Diseased Snape grass[Cure,Inspect,Guide] 33684,33685,33686
            return "Diseased";
        }
        if (value == 205)
        {
            // Allotment[Rake,Inspect,Guide] 8576
            return "Empty";
        }
        if (value >= 206 && value <= 208)
        {
            // Dead onions[Clear,Inspect,Guide] 8592,8593,8594
            return "Dead";
        }
        if (value >= 209 && value <= 211)
        {
            // Dead Snape grass[Clear,Inspect,Guide] 33690,33691,33692
            return "Dead";
        }
        if (value == 212)
        {
            // Allotment[Rake,Inspect,Guide] 8576
            return "Empty";
        }
        if (value >= 213 && value <= 215)
        {
            // Dead cabbages[Clear,Inspect,Guide] 8547,8548,8549
            return "Dead";
        }
        if (value >= 216 && value <= 219)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576,8576
            return "Empty";
        }
        if (value >= 220 && value <= 222)
        {
            // Dead tomato plant[Clear,Inspect,Guide] 8653,8654,8655
            return "Dead";
        }
        if (value >= 223 && value <= 226)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576,8576
            return "Empty";
        }
        if (value >= 227 && value <= 231)
        {
            // Dead sweetcorn plant[Clear,Inspect,Guide] 8636,8637,8638,8639,8640
            return "Dead";
        }
        if (value >= 232 && value <= 235)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576,8576
            return "Empty";
        }
        if (value >= 236 && value <= 240)
        {
            // Dead strawberry plant[Clear,Inspect,Guide] 8613,8614,8615,8616,8617
            return "Dead";
        }
        if (value >= 241 && value <= 244)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576,8576
            return "Empty";
        }
        if (value >= 245 && value <= 251)
        {
            // Dead watermelons[Clear,Inspect,Guide] 8680,8681,8682,8683,8684,8685,8686
            return "Dead";
        }
        if (value >= 252 && value <= 255)
        {
            // Allotment[Rake,Inspect,Guide] 8576,8576,8576,8576
            return "Empty";
        }
        return "-";
    }
}
