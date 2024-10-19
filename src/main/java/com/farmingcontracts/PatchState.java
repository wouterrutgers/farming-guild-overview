package com.farmingcontracts;

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
                return "Empty";
            }
            if (value >= 4 && value <= 7)
            {
                return "Empty";
            }
            if (value >= 8 && value <= 17)
            {
                return "Growing";
            }
            if (value == 18)
            {
                return "Completed";
            }
            if (value >= 19 && value <= 27)
            {
                return "Diseased";
            }
            if (value >= 28 && value <= 36)
            {
                return "Dead";
            }
            if (value == 37)
            {
                return "Completed";
            }
            if (value >= 41 && value <= 55)
            {
                return "Completed";
            }
            return "-";
        }
    },

    FRUIT_TREE("Fruit tree", Varbits.FARMING_7909) {
        @Override
        public String forVarbitValue(int value) {
            if (value >= 0 && value <= 3)
            {
                return "Empty";
            }
            if (value >= 4 && value <= 7)
            {
                return "Empty";
            }
            if (value >= 8 && value <= 13)
            {
                return "Growing";
            }
            if (value >= 14 && value <= 20)
            {
                return "Completed";
            }
            if (value >= 21 && value <= 26)
            {
                return "Diseased";
            }
            if (value >= 27 && value <= 32)
            {
                return "Dead";
            }
            if (value == 33)
            {
                return "Completed";
            }
            if (value == 34)
            {
                return "Completed";
            }
            if (value >= 35 && value <= 40)
            {
                return "Growing";
            }
            if (value >= 41 && value <= 47)
            {
                return "Completed";
            }
            if (value >= 48 && value <= 53)
            {
                return "Diseased";
            }
            if (value >= 54 && value <= 59)
            {
                return "Dead";
            }
            if (value == 60)
            {
                return "Completed";
            }
            if (value == 61)
            {
                return "Completed";
            }
            if (value >= 62 && value <= 71)
            {
                return "Empty";
            }
            if (value >= 72 && value <= 77)
            {
                return "Growing";
            }
            if (value >= 78 && value <= 84)
            {
                return "Completed";
            }
            if (value >= 85 && value <= 89)
            {
                return "Diseased";
            }
            if (value == 90)
            {
                return "Diseased";
            }
            if (value >= 91 && value <= 96)
            {
                return "Dead";
            }
            if (value == 97)
            {
                return "Completed";
            }
            if (value == 98)
            {
                return "Completed";
            }
            if (value >= 99 && value <= 104)
            {
                return "Growing";
            }
            if (value >= 105 && value <= 111)
            {
                return "Completed";
            }
            if (value >= 112 && value <= 117)
            {
                return "Diseased";
            }
            if (value >= 118 && value <= 123)
            {
                return "Dead";
            }
            if (value == 124)
            {
                return "Completed";
            }
            if (value == 125)
            {
                return "Completed";
            }
            if (value >= 126 && value <= 135)
            {
                return "Empty";
            }
            if (value >= 136 && value <= 141)
            {
                return "Growing";
            }
            if (value >= 142 && value <= 148)
            {
                return "Completed";
            }
            if (value >= 149 && value <= 154)
            {
                return "Diseased";
            }
            if (value >= 155 && value <= 160)
            {
                return "Dead";
            }
            if (value == 161)
            {
                return "Completed";
            }
            if (value == 162)
            {
                return "Completed";
            }
            if (value >= 163 && value <= 168)
            {
                return "Growing";
            }
            if (value >= 169 && value <= 175)
            {
                return "Completed";
            }
            if (value >= 176 && value <= 181)
            {
                return "Diseased";
            }
            if (value >= 182 && value <= 187)
            {
                return "Dead";
            }
            if (value == 188)
            {
                return "Completed";
            }
            if (value == 189)
            {
                return "Completed";
            }
            if (value >= 190 && value <= 199)
            {
                return "Empty";
            }
            if (value >= 200 && value <= 205)
            {
                return "Growing";
            }
            if (value >= 206 && value <= 212)
            {
                return "Completed";
            }
            if (value >= 213 && value <= 218)
            {
                return "Diseased";
            }
            if (value >= 219 && value <= 224)
            {
                return "Dead";
            }
            if (value == 225)
            {
                return "Completed";
            }
            if (value == 226)
            {
                return "Completed";
            }
            if (value >= 227 && value <= 232)
            {
                return "Growing";
            }
            if (value >= 233 && value <= 239)
            {
                return "Completed";
            }
            if (value >= 240 && value <= 245)
            {
                return "Diseased";
            }
            if (value >= 246 && value <= 251)
            {
                return "Dead";
            }
            if (value == 252)
            {
                return "Completed";
            }
            if (value == 253)
            {
                return "Completed";
            }
            if (value >= 254 && value <= 255)
            {
                return "Empty";
            }
            return "-";
        }
    },

    CELASTRUS("Celastrus", Varbits.FARMING_7910) {
        @Override
        public String forVarbitValue(int value) {
            if (value >= 0 && value <= 3) {
                return "Empty";
            }
            if (value >= 4 && value <= 7) {
                return "Empty";
            }
            if (value >= 8 && value <= 12) {
                return "Growing";
            }
            if (value == 13) {
                return "Completed";
            }
            if (value >= 14 && value <= 16) {
                return "Completed";
            }
            if (value == 17) {
                return "Completed";
            }
            if (value >= 18 && value <= 22) {
                return "Diseased";
            }
            if (value >= 23 && value <= 27) {
                return "Dead";
            }
            if (value == 28) {
                return "Completed";
            }
            if (value >= 29 && value <= 255) {
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
                return "Empty";
            }
            if (value >= 4 && value <= 7)
            {
                return "Empty";
            }
            if (value >= 8 && value <= 11)
            {
                return "Growing";
            }
            if (value == 12)
            {
                return "Completed";
            }
            if (value == 13)
            {
                return "Completed";
            }
            if (value == 14)
            {
                return "Completed";
            }
            if (value >= 15 && value <= 20)
            {
                return "Growing";
            }
            if (value == 21)
            {
                return "Completed";
            }
            if (value == 22)
            {
                return "Completed";
            }
            if (value == 23)
            {
                return "Completed";
            }
            if (value >= 24 && value <= 31)
            {
                return "Growing";
            }
            if (value == 32)
            {
                return "Completed";
            }
            if (value == 33)
            {
                return "Completed";
            }
            if (value == 34)
            {
                return "Completed";
            }
            if (value >= 35 && value <= 44)
            {
                return "Growing";
            }
            if (value == 45)
            {
                return "Completed";
            }
            if (value == 46)
            {
                return "Completed";
            }
            if (value == 47)
            {
                return "Completed";
            }
            if (value >= 48 && value <= 59)
            {
                return "Growing";
            }
            if (value == 60)
            {
                return "Completed";
            }
            if (value == 61)
            {
                return "Completed";
            }
            if (value == 62)
            {
                return "Completed";
            }
            if (value >= 63 && value <= 72)
            {
                return "Empty";
            }
            if (value >= 73 && value <= 75)
            {
                return "Diseased";
            }
            if (value == 77)
            {
                return "Diseased";
            }
            if (value >= 78 && value <= 79)
            {
                return "Empty";
            }
            if (value >= 80 && value <= 84)
            {
                return "Diseased";
            }
            if (value == 86)
            {
                return "Diseased";
            }
            if (value >= 87 && value <= 88)
            {
                return "Empty";
            }
            if (value >= 89 && value <= 95)
            {
                return "Diseased";
            }
            if (value == 97)
            {
                return "Diseased";
            }
            if (value >= 98 && value <= 99)
            {
                return "Empty";
            }
            if (value >= 100 && value <= 108)
            {
                return "Diseased";
            }
            if (value == 110)
            {
                return "Diseased";
            }
            if (value >= 111 && value <= 112)
            {
                return "Empty";
            }
            if (value >= 113 && value <= 123)
            {
                return "Diseased";
            }
            if (value == 125)
            {
                return "Diseased";
            }
            if (value >= 126 && value <= 136)
            {
                return "Empty";
            }
            if (value >= 137 && value <= 139)
            {
                return "Completed";
            }
            if (value == 141)
            {
                return "Completed";
            }
            if (value >= 142 && value <= 143)
            {
                return "Empty";
            }
            if (value >= 144 && value <= 148)
            {
                return "Completed";
            }
            if (value == 150)
            {
                return "Completed";
            }
            if (value >= 151 && value <= 152)
            {
                return "Empty";
            }
            if (value >= 153 && value <= 159)
            {
                return "Completed";
            }
            if (value == 161)
            {
                return "Completed";
            }
            if (value >= 162 && value <= 163)
            {
                return "Empty";
            }
            if (value >= 164 && value <= 172)
            {
                return "Completed";
            }
            if (value == 174)
            {
                return "Completed";
            }
            if (value >= 175 && value <= 176)
            {
                return "Empty";
            }
            if (value >= 177 && value <= 187)
            {
                return "Completed";
            }
            if (value == 189)
            {
                return "Completed";
            }
            if (value >= 190 && value <= 191)
            {
                return "Empty";
            }
            if (value >= 192 && value <= 197)
            {
                return "Completed";
            }
            if (value >= 198 && value <= 255)
            {
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
                return "Empty";
            }
            if (value >= 4 && value <= 7)
            {
                return "Growing";
            }
            if (value >= 8 && value <= 10)
            {
                return "Completed";
            }
            if (value >= 11 && value <= 14)
            {
                return "Growing";
            }
            if (value >= 15 && value <= 17)
            {
                return "Completed";
            }
            if (value >= 18 && value <= 21)
            {
                return "Growing";
            }
            if (value >= 22 && value <= 24)
            {
                return "Completed";
            }
            if (value >= 25 && value <= 28)
            {
                return "Growing";
            }
            if (value >= 29 && value <= 31)
            {
                return "Completed";
            }
            if (value >= 32 && value <= 35)
            {
                return "Growing";
            }
            if (value >= 36 && value <= 38)
            {
                return "Completed";
            }
            if (value >= 39 && value <= 42)
            {
                return "Growing";
            }
            if (value >= 43 && value <= 45)
            {
                return "Completed";
            }
            if (value >= 46 && value <= 49)
            {
                return "Growing";
            }
            if (value >= 50 && value <= 52)
            {
                return "Completed";
            }
            if (value >= 53 && value <= 56)
            {
                return "Growing";
            }
            if (value >= 57 && value <= 59)
            {
                return "Completed";
            }
            if (value >= 60 && value <= 67)
            {
                return "Empty";
            }
            if (value >= 68 && value <= 71)
            {
                return "Growing";
            }
            if (value >= 72 && value <= 74)
            {
                return "Completed";
            }
            if (value >= 75 && value <= 78)
            {
                return "Growing";
            }
            if (value >= 79 && value <= 81)
            {
                return "Completed";
            }
            if (value >= 82 && value <= 85)
            {
                return "Growing";
            }
            if (value >= 86 && value <= 88)
            {
                return "Completed";
            }
            if (value >= 89 && value <= 92)
            {
                return "Growing";
            }
            if (value >= 93 && value <= 95)
            {
                return "Completed";
            }
            if (value >= 96 && value <= 99)
            {
                return "Growing";
            }
            if (value >= 100 && value <= 102)
            {
                return "Completed";
            }
            if (value >= 103 && value <= 106)
            {
                return "Growing";
            }
            if (value >= 107 && value <= 109)
            {
                return "Completed";
            }
            if (value >= 128 && value <= 130)
            {
                return "Diseased";
            }
            if (value >= 131 && value <= 133)
            {
                return "Diseased";
            }
            if (value >= 134 && value <= 136)
            {
                return "Diseased";
            }
            if (value >= 137 && value <= 139)
            {
                return "Diseased";
            }
            if (value >= 140 && value <= 142)
            {
                return "Diseased";
            }
            if (value >= 143 && value <= 145)
            {
                return "Diseased";
            }
            if (value >= 146 && value <= 148)
            {
                return "Diseased";
            }
            if (value >= 149 && value <= 151)
            {
                return "Diseased";
            }
            if (value >= 152 && value <= 154)
            {
                return "Diseased";
            }
            if (value >= 155 && value <= 157)
            {
                return "Diseased";
            }
            if (value >= 158 && value <= 160)
            {
                return "Diseased";
            }
            if (value >= 161 && value <= 163)
            {
                return "Diseased";
            }
            if (value >= 164 && value <= 166)
            {
                return "Diseased";
            }
            if (value >= 167 && value <= 169)
            {
                return "Diseased";
            }
            if (value >= 170 && value <= 172)
            {
                return "Dead";
            }
            if (value >= 173 && value <= 191)
            {
                return "Empty";
            }
            if (value >= 192 && value <= 195)
            {
                return "Growing";
            }
            if (value >= 196 && value <= 197)
            {
                return "Completed";
            }
            if (value >= 198 && value <= 200)
            {
                return "Diseased";
            }
            if (value >= 201 && value <= 203)
            {
                return "Dead";
            }
            if (value >= 204 && value <= 219)
            {
                return "Empty";
            }
            if (value >= 221 && value <= 255)
            {
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
                return "Empty";
            }
            if (value >= 4 && value <= 7)
            {
                return "Empty";
            }
            if (value >= 8 && value <= 14)
            {
                return "Growing";
            }
            if (value >= 15 && value <= 18)
            {
                return "Completed";
            }
            if (value >= 19 && value <= 24)
            {
                return "Diseased";
            }
            if (value >= 25 && value <= 30)
            {
                return "Dead";
            }
            if (value == 31)
            {
                return "Completed";
            }
            if (value >= 32 && value <= 38)
            {
                return "Growing";
            }
            if (value >= 39 && value <= 45)
            {
                return "Completed";
            }
            if (value >= 46 && value <= 51)
            {
                return "Diseased";
            }
            if (value >= 52 && value <= 57)
            {
                return "Dead";
            }
            if (value == 58)
            {
                return "Completed";
            }
            if (value >= 59 && value <= 255)
            {
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
                return "Empty";
            }
            if (value == 4)
            {
                return "Empty";
            }
            if (value >= 5 && value <= 9)
            {
                return "Growing";
            }
            if (value >= 10 && value <= 14)
            {
                return "Completed";
            }
            if (value >= 15 && value <= 20)
            {
                return "Growing";
            }
            if (value >= 21 && value <= 25)
            {
                return "Completed";
            }
            if (value >= 26 && value <= 32)
            {
                return "Growing";
            }
            if (value >= 33 && value <= 37)
            {
                return "Completed";
            }
            if (value >= 38 && value <= 45)
            {
                return "Growing";
            }
            if (value >= 46 && value <= 50)
            {
                return "Completed";
            }
            if (value >= 51 && value <= 58)
            {
                return "Growing";
            }
            if (value >= 59 && value <= 63)
            {
                return "Completed";
            }
            if (value >= 64 && value <= 69)
            {
                return "Empty";
            }
            if (value >= 70 && value <= 74)
            {
                return "Diseased";
            }
            if (value >= 75 && value <= 79)
            {
                return "Empty";
            }
            if (value >= 80 && value <= 85)
            {
                return "Diseased";
            }
            if (value >= 86 && value <= 90)
            {
                return "Empty";
            }
            if (value >= 91 && value <= 97)
            {
                return "Diseased";
            }
            if (value >= 98 && value <= 102)
            {
                return "Empty";
            }
            if (value >= 103 && value <= 110)
            {
                return "Diseased";
            }
            if (value >= 111 && value <= 115)
            {
                return "Empty";
            }
            if (value >= 116 && value <= 123)
            {
                return "Diseased";
            }
            if (value >= 124 && value <= 133)
            {
                return "Empty";
            }
            if (value >= 134 && value <= 138)
            {
                return "Dead";
            }
            if (value >= 139 && value <= 143)
            {
                return "Empty";
            }
            if (value >= 144 && value <= 149)
            {
                return "Dead";
            }
            if (value >= 150 && value <= 154)
            {
                return "Empty";
            }
            if (value >= 155 && value <= 161)
            {
                return "Dead";
            }
            if (value >= 162 && value <= 166)
            {
                return "Empty";
            }
            if (value >= 167 && value <= 174)
            {
                return "Dead";
            }
            if (value >= 175 && value <= 179)
            {
                return "Empty";
            }
            if (value >= 180 && value <= 187)
            {
                return "Dead";
            }
            if (value >= 188 && value <= 196)
            {
                return "Empty";
            }
            if (value >= 197 && value <= 204)
            {
                return "Growing";
            }
            if (value >= 205 && value <= 209)
            {
                return "Completed";
            }
            if (value >= 210 && value <= 216)
            {
                return "Diseased";
            }
            if (value >= 217 && value <= 224)
            {
                return "Dead";
            }
            if (value == 225)
            {
                return "Diseased";
            }
            if (value >= 226 && value <= 249)
            {
                return "Empty";
            }
            if (value == 250)
            {
                return "Completed";
            }
            if (value == 251)
            {
                return "Completed";
            }
            if (value == 252)
            {
                return "Completed";
            }
            if (value == 253)
            {
                return "Completed";
            }
            if (value == 254)
            {
                return "Completed";
            }
            if (value == 255)
            {
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
                return "Empty";
            }
            if (value >= 4 && value <= 7)
            {
                return "Empty";
            }
            if (value >= 8 && value <= 11)
            {
                return "Growing";
            }
            if (value == 12)
            {
                return "Completed";
            }
            if (value >= 13 && value <= 16)
            {
                return "Growing";
            }
            if (value == 17)
            {
                return "Completed";
            }
            if (value >= 18 && value <= 21)
            {
                return "Growing";
            }
            if (value == 22)
            {
                return "Completed";
            }
            if (value >= 23 && value <= 26)
            {
                return "Growing";
            }
            if (value == 27)
            {
                return "Completed";
            }
            if (value >= 28 && value <= 31)
            {
                return "Growing";
            }
            if (value == 32)
            {
                return "Completed";
            }
            if (value >= 33 && value <= 35)
            {
                return "Completed";
            }
            if (value == 36)
            {
                return "Completed";
            }
            if (value >= 37 && value <= 40)
            {
                return "Growing";
            }
            if (value == 41)
            {
                return "Completed";
            }
            if (value >= 42 && value <= 71)
            {
                return "Empty";
            }
            if (value >= 72 && value <= 75)
            {
                return "Growing";
            }
            if (value == 76)
            {
                return "Empty";
            }
            if (value >= 77 && value <= 80)
            {
                return "Growing";
            }
            if (value == 81)
            {
                return "Empty";
            }
            if (value >= 82 && value <= 85)
            {
                return "Growing";
            }
            if (value == 86)
            {
                return "Empty";
            }
            if (value >= 87 && value <= 90)
            {
                return "Growing";
            }
            if (value == 91)
            {
                return "Empty";
            }
            if (value >= 92 && value <= 95)
            {
                return "Growing";
            }
            if (value >= 96 && value <= 100)
            {
                return "Empty";
            }
            if (value >= 101 && value <= 104)
            {
                return "Growing";
            }
            if (value >= 105 && value <= 136)
            {
                return "Empty";
            }
            if (value >= 137 && value <= 139)
            {
                return "Diseased";
            }
            if (value >= 140 && value <= 141)
            {
                return "Empty";
            }
            if (value >= 142 && value <= 144)
            {
                return "Diseased";
            }
            if (value >= 145 && value <= 146)
            {
                return "Empty";
            }
            if (value >= 147 && value <= 149)
            {
                return "Diseased";
            }
            if (value >= 150 && value <= 151)
            {
                return "Empty";
            }
            if (value >= 152 && value <= 154)
            {
                return "Diseased";
            }
            if (value >= 155 && value <= 156)
            {
                return "Empty";
            }
            if (value >= 157 && value <= 159)
            {
                return "Diseased";
            }
            if (value >= 160 && value <= 165)
            {
                return "Empty";
            }
            if (value >= 166 && value <= 168)
            {
                return "Diseased";
            }
            if (value >= 169 && value <= 200)
            {
                return "Empty";
            }
            if (value >= 201 && value <= 204)
            {
                return "Dead";
            }
            if (value == 205)
            {
                return "Empty";
            }
            if (value >= 206 && value <= 209)
            {
                return "Dead";
            }
            if (value == 210)
            {
                return "Empty";
            }
            if (value >= 211 && value <= 214)
            {
                return "Dead";
            }
            if (value == 215)
            {
                return "Empty";
            }
            if (value >= 216 && value <= 219)
            {
                return "Dead";
            }
            if (value == 220)
            {
                return "Empty";
            }
            if (value >= 221 && value <= 224)
            {
                return "Dead";
            }
            if (value >= 225 && value <= 229)
            {
                return "Empty";
            }
            if (value >= 230 && value <= 233)
            {
                return "Dead";
            }
            if (value >= 234 && value <= 255)
            {
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
            return "Empty";
        }
        if (value >= 4 && value <= 5)
        {
            return "Empty";
        }
        if (value >= 6 && value <= 9)
        {
            return "Growing";
        }
        if (value >= 10 && value <= 12)
        {
            return "Completed";
        }
        if (value >= 13 && value <= 16)
        {
            return "Growing";
        }
        if (value >= 17 && value <= 19)
        {
            return "Completed";
        }
        if (value >= 20 && value <= 23)
        {
            return "Growing";
        }
        if (value >= 24 && value <= 26)
        {
            return "Completed";
        }
        if (value >= 27 && value <= 30)
        {
            return "Growing";
        }
        if (value >= 31 && value <= 33)
        {
            return "Completed";
        }
        if (value >= 34 && value <= 39)
        {
            return "Growing";
        }
        if (value >= 40 && value <= 42)
        {
            return "Completed";
        }
        if (value >= 43 && value <= 48)
        {
            return "Growing";
        }
        if (value >= 49 && value <= 51)
        {
            return "Completed";
        }
        if (value >= 52 && value <= 59)
        {
            return "Growing";
        }
        if (value >= 60 && value <= 62)
        {
            return "Completed";
        }
        if (value >= 63 && value <= 69)
        {
            return "Growing";
        }
        if (value >= 70 && value <= 73)
        {
            return "Growing";
        }
        if (value >= 74 && value <= 76)
        {
            return "Empty";
        }
        if (value >= 77 && value <= 80)
        {
            return "Growing";
        }
        if (value >= 81 && value <= 83)
        {
            return "Empty";
        }
        if (value >= 84 && value <= 87)
        {
            return "Growing";
        }
        if (value >= 88 && value <= 90)
        {
            return "Empty";
        }
        if (value >= 91 && value <= 94)
        {
            return "Growing";
        }
        if (value >= 95 && value <= 97)
        {
            return "Empty";
        }
        if (value >= 98 && value <= 103)
        {
            return "Growing";
        }
        if (value >= 104 && value <= 106)
        {
            return "Empty";
        }
        if (value >= 107 && value <= 112)
        {
            return "Growing";
        }
        if (value >= 113 && value <= 115)
        {
            return "Empty";
        }
        if (value >= 116 && value <= 123)
        {
            return "Growing";
        }
        if (value >= 124 && value <= 127)
        {
            return "Empty";
        }
        if (value >= 128 && value <= 134)
        {
            return "Growing";
        }
        if (value >= 135 && value <= 137)
        {
            return "Diseased";
        }
        if (value >= 138 && value <= 140)
        {
            return "Completed";
        }
        if (value == 141)
        {
            return "Empty";
        }
        if (value >= 142 && value <= 144)
        {
            return "Diseased";
        }
        if (value >= 145 && value <= 148)
        {
            return "Empty";
        }
        if (value >= 149 && value <= 151)
        {
            return "Diseased";
        }
        if (value >= 152 && value <= 155)
        {
            return "Empty";
        }
        if (value >= 156 && value <= 158)
        {
            return "Diseased";
        }
        if (value >= 159 && value <= 162)
        {
            return "Empty";
        }
        if (value >= 163 && value <= 167)
        {
            return "Diseased";
        }
        if (value >= 168 && value <= 171)
        {
            return "Empty";
        }
        if (value >= 172 && value <= 176)
        {
            return "Diseased";
        }
        if (value >= 177 && value <= 180)
        {
            return "Empty";
        }
        if (value >= 181 && value <= 187)
        {
            return "Diseased";
        }
        if (value >= 188 && value <= 192)
        {
            return "Empty";
        }
        if (value >= 193 && value <= 195)
        {
            return "Dead";
        }
        if (value >= 196 && value <= 198)
        {
            return "Diseased";
        }
        if (value >= 199 && value <= 201)
        {
            return "Dead";
        }
        if (value >= 202 && value <= 204)
        {
            return "Diseased";
        }
        if (value == 205)
        {
            return "Empty";
        }
        if (value >= 206 && value <= 208)
        {
            return "Dead";
        }
        if (value >= 209 && value <= 211)
        {
            return "Dead";
        }
        if (value == 212)
        {
            return "Empty";
        }
        if (value >= 213 && value <= 215)
        {
            return "Dead";
        }
        if (value >= 216 && value <= 219)
        {
            return "Empty";
        }
        if (value >= 220 && value <= 222)
        {
            return "Dead";
        }
        if (value >= 223 && value <= 226)
        {
            return "Empty";
        }
        if (value >= 227 && value <= 231)
        {
            return "Dead";
        }
        if (value >= 232 && value <= 235)
        {
            return "Empty";
        }
        if (value >= 236 && value <= 240)
        {
            return "Dead";
        }
        if (value >= 241 && value <= 244)
        {
            return "Empty";
        }
        if (value >= 245 && value <= 251)
        {
            return "Dead";
        }
        if (value >= 252 && value <= 255)
        {
            return "Empty";
        }
        return "-";
    }
}
