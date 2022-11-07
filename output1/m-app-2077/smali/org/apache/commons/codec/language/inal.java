class inal {
	 /* .source "SoundexUtils.java" */
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 31 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static java.lang.String clean ( java.lang.String p0 ) {
		 /* .locals 7 */
		 /* .param p0, "str" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 42 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 v5 = 			 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
			 /* if-nez v5, :cond_1 */
			 /* .line 56 */
		 } // .end local p0 # "str":Ljava/lang/String;
		 /* .local v0, "chars":[C */
		 /* .local v2, "count":I */
		 /* .local v3, "i":I */
		 /* .local v4, "len":I */
	 } // :cond_0
} // :goto_0
/* .line 45 */
} // .end local v0 # "chars":[C
} // .end local v2 # "count":I
} // .end local v3 # "i":I
} // .end local v4 # "len":I
/* .restart local p0 # "str":Ljava/lang/String; */
} // :cond_1
v4 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* .line 46 */
/* .restart local v4 # "len":I */
/* new-array v0, v4, [C */
/* .line 47 */
/* .restart local v0 # "chars":[C */
int v1 = 0; // const/4 v1, 0x0
/* .line 48 */
/* .local v1, "count":I */
int v3 = 0; // const/4 v3, 0x0
/* .restart local v3 # "i":I */
/* move v2, v1 */
} // .end local v1 # "count":I
/* .restart local v2 # "count":I */
} // :goto_1
/* if-ge v3, v4, :cond_2 */
/* .line 49 */
v5 = (( java.lang.String ) p0 ).charAt ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C
v5 = java.lang.Character .isLetter ( v5 );
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 50 */
/* add-int/lit8 v1, v2, 0x1 */
} // .end local v2 # "count":I
/* .restart local v1 # "count":I */
v5 = (( java.lang.String ) p0 ).charAt ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C
/* aput-char v5, v0, v2 */
/* .line 48 */
} // :goto_2
/* add-int/lit8 v3, v3, 0x1 */
/* move v2, v1 */
} // .end local v1 # "count":I
/* .restart local v2 # "count":I */
/* .line 53 */
} // :cond_2
/* if-ne v2, v4, :cond_3 */
/* .line 54 */
v5 = java.util.Locale.ENGLISH;
(( java.lang.String ) p0 ).toUpperCase ( v5 ); // invoke-virtual {p0, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
/* .line 56 */
} // :cond_3
/* new-instance v5, Ljava/lang/String; */
int v6 = 0; // const/4 v6, 0x0
/* invoke-direct {v5, v0, v6, v2}, Ljava/lang/String;-><init>([CII)V */
v6 = java.util.Locale.ENGLISH;
(( java.lang.String ) v5 ).toUpperCase ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
} // :cond_4
/* move v1, v2 */
} // .end local v2 # "count":I
/* .restart local v1 # "count":I */
} // .end method
static Integer difference ( org.apache.commons.codec.StringEncoder p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 2 */
/* .param p0, "encoder" # Lorg/apache/commons/codec/StringEncoder; */
/* .param p1, "s1" # Ljava/lang/String; */
/* .param p2, "s2" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 86 */
v0 = org.apache.commons.codec.language.SoundexUtils .differenceEncoded ( v0,v1 );
} // .end method
static Integer differenceEncoded ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 5 */
/* .param p0, "es1" # Ljava/lang/String; */
/* .param p1, "es2" # Ljava/lang/String; */
/* .prologue */
/* .line 111 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* if-nez p1, :cond_2 */
/* .line 112 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 121 */
} // :cond_1
/* .line 114 */
} // :cond_2
v3 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
v4 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
v2 = java.lang.Math .min ( v3,v4 );
/* .line 115 */
/* .local v2, "lengthToMatch":I */
int v0 = 0; // const/4 v0, 0x0
/* .line 116 */
/* .local v0, "diff":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* if-ge v1, v2, :cond_1 */
/* .line 117 */
v3 = (( java.lang.String ) p0 ).charAt ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
v4 = (( java.lang.String ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
/* if-ne v3, v4, :cond_3 */
/* .line 118 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 116 */
} // :cond_3
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
