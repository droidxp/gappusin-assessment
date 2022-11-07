public class org.apache.commons.codec.language.Caverphone2 extends org.apache.commons.codec.language.AbstractCaverphone {
	 /* .source "Caverphone2.java" */
	 /* # static fields */
	 private static final java.lang.String TEN_1;
	 /* # direct methods */
	 public org.apache.commons.codec.language.Caverphone2 ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0}, Lorg/apache/commons/codec/language/AbstractCaverphone;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String encode ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .param p1, "source" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 46 */
		 /* move-object v0, p1 */
		 /* .line 47 */
		 /* .local v0, "txt":Ljava/lang/String; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v1 = 			 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
			 /* if-nez v1, :cond_1 */
			 /* .line 48 */
		 } // :cond_0
		 final String v1 = "1111111111"; // const-string v1, "1111111111"
		 /* .line 128 */
	 } // :goto_0
	 /* .line 52 */
} // :cond_1
v1 = java.util.Locale.ENGLISH;
(( java.lang.String ) v0 ).toLowerCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
/* .line 55 */
final String v1 = "[^a-z]"; // const-string v1, "[^a-z]"
final String v2 = ""; // const-string v2, ""
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 58 */
final String v1 = "e$"; // const-string v1, "e$"
final String v2 = ""; // const-string v2, ""
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 61 */
final String v1 = "^cough"; // const-string v1, "^cough"
final String v2 = "cou2f"; // const-string v2, "cou2f"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 62 */
final String v1 = "^rough"; // const-string v1, "^rough"
final String v2 = "rou2f"; // const-string v2, "rou2f"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 63 */
final String v1 = "^tough"; // const-string v1, "^tough"
final String v2 = "tou2f"; // const-string v2, "tou2f"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 64 */
final String v1 = "^enough"; // const-string v1, "^enough"
final String v2 = "enou2f"; // const-string v2, "enou2f"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 65 */
final String v1 = "^trough"; // const-string v1, "^trough"
final String v2 = "trou2f"; // const-string v2, "trou2f"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 67 */
final String v1 = "^gn"; // const-string v1, "^gn"
final String v2 = "2n"; // const-string v2, "2n"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 70 */
final String v1 = "mb$"; // const-string v1, "mb$"
final String v2 = "m2"; // const-string v2, "m2"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 73 */
final String v1 = "cq"; // const-string v1, "cq"
final String v2 = "2q"; // const-string v2, "2q"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 74 */
final String v1 = "ci"; // const-string v1, "ci"
final String v2 = "si"; // const-string v2, "si"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 75 */
final String v1 = "ce"; // const-string v1, "ce"
final String v2 = "se"; // const-string v2, "se"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 76 */
final String v1 = "cy"; // const-string v1, "cy"
final String v2 = "sy"; // const-string v2, "sy"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 77 */
final String v1 = "tch"; // const-string v1, "tch"
final String v2 = "2ch"; // const-string v2, "2ch"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 78 */
final String v1 = "c"; // const-string v1, "c"
final String v2 = "k"; // const-string v2, "k"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 79 */
final String v1 = "q"; // const-string v1, "q"
final String v2 = "k"; // const-string v2, "k"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 80 */
final String v1 = "x"; // const-string v1, "x"
final String v2 = "k"; // const-string v2, "k"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 81 */
final String v1 = "v"; // const-string v1, "v"
final String v2 = "f"; // const-string v2, "f"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 82 */
final String v1 = "dg"; // const-string v1, "dg"
final String v2 = "2g"; // const-string v2, "2g"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 83 */
final String v1 = "tio"; // const-string v1, "tio"
final String v2 = "sio"; // const-string v2, "sio"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 84 */
final String v1 = "tia"; // const-string v1, "tia"
final String v2 = "sia"; // const-string v2, "sia"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 85 */
final String v1 = "d"; // const-string v1, "d"
final String v2 = "t"; // const-string v2, "t"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 86 */
final String v1 = "ph"; // const-string v1, "ph"
final String v2 = "fh"; // const-string v2, "fh"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 87 */
final String v1 = "b"; // const-string v1, "b"
final String v2 = "p"; // const-string v2, "p"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 88 */
final String v1 = "sh"; // const-string v1, "sh"
final String v2 = "s2"; // const-string v2, "s2"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 89 */
final String v1 = "z"; // const-string v1, "z"
final String v2 = "s"; // const-string v2, "s"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 90 */
final String v1 = "^[aeiou]"; // const-string v1, "^[aeiou]"
final String v2 = "A"; // const-string v2, "A"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 91 */
final String v1 = "[aeiou]"; // const-string v1, "[aeiou]"
final String v2 = "3"; // const-string v2, "3"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 92 */
final String v1 = "j"; // const-string v1, "j"
final String v2 = "y"; // const-string v2, "y"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 93 */
final String v1 = "^y3"; // const-string v1, "^y3"
final String v2 = "Y3"; // const-string v2, "Y3"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 94 */
final String v1 = "^y"; // const-string v1, "^y"
final String v2 = "A"; // const-string v2, "A"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 95 */
final String v1 = "y"; // const-string v1, "y"
final String v2 = "3"; // const-string v2, "3"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 96 */
final String v1 = "3gh3"; // const-string v1, "3gh3"
final String v2 = "3kh3"; // const-string v2, "3kh3"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 97 */
final String v1 = "gh"; // const-string v1, "gh"
final String v2 = "22"; // const-string v2, "22"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 98 */
final String v1 = "g"; // const-string v1, "g"
final String v2 = "k"; // const-string v2, "k"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 99 */
final String v1 = "s+"; // const-string v1, "s+"
final String v2 = "S"; // const-string v2, "S"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 100 */
final String v1 = "t+"; // const-string v1, "t+"
final String v2 = "T"; // const-string v2, "T"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 101 */
final String v1 = "p+"; // const-string v1, "p+"
final String v2 = "P"; // const-string v2, "P"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 102 */
final String v1 = "k+"; // const-string v1, "k+"
final String v2 = "K"; // const-string v2, "K"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 103 */
final String v1 = "f+"; // const-string v1, "f+"
final String v2 = "F"; // const-string v2, "F"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 104 */
final String v1 = "m+"; // const-string v1, "m+"
final String v2 = "M"; // const-string v2, "M"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 105 */
final String v1 = "n+"; // const-string v1, "n+"
final String v2 = "N"; // const-string v2, "N"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 106 */
final String v1 = "w3"; // const-string v1, "w3"
final String v2 = "W3"; // const-string v2, "W3"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 107 */
final String v1 = "wh3"; // const-string v1, "wh3"
final String v2 = "Wh3"; // const-string v2, "Wh3"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 108 */
final String v1 = "w$"; // const-string v1, "w$"
final String v2 = "3"; // const-string v2, "3"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 109 */
final String v1 = "w"; // const-string v1, "w"
final String v2 = "2"; // const-string v2, "2"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 110 */
final String v1 = "^h"; // const-string v1, "^h"
final String v2 = "A"; // const-string v2, "A"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 111 */
final String v1 = "h"; // const-string v1, "h"
final String v2 = "2"; // const-string v2, "2"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 112 */
final String v1 = "r3"; // const-string v1, "r3"
final String v2 = "R3"; // const-string v2, "R3"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 113 */
final String v1 = "r$"; // const-string v1, "r$"
final String v2 = "3"; // const-string v2, "3"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 114 */
final String v1 = "r"; // const-string v1, "r"
final String v2 = "2"; // const-string v2, "2"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 115 */
final String v1 = "l3"; // const-string v1, "l3"
final String v2 = "L3"; // const-string v2, "L3"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 116 */
final String v1 = "l$"; // const-string v1, "l$"
final String v2 = "3"; // const-string v2, "3"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 117 */
final String v1 = "l"; // const-string v1, "l"
final String v2 = "2"; // const-string v2, "2"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 120 */
final String v1 = "2"; // const-string v1, "2"
final String v2 = ""; // const-string v2, ""
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 121 */
final String v1 = "3$"; // const-string v1, "3$"
final String v2 = "A"; // const-string v2, "A"
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 122 */
final String v1 = "3"; // const-string v1, "3"
final String v2 = ""; // const-string v2, ""
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 125 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "1111111111"; // const-string v2, "1111111111"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 128 */
int v1 = 0; // const/4 v1, 0x0
final String v2 = "1111111111"; // const-string v2, "1111111111"
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
(( java.lang.String ) v0 ).substring ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* goto/16 :goto_0 */
} // .end method
