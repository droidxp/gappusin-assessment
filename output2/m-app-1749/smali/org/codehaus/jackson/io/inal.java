public class inal {
	 /* .source "NumberInput.java" */
	 /* # static fields */
	 static final Long L_BILLION;
	 static final java.lang.String MAX_LONG_STR;
	 static final java.lang.String MIN_LONG_STR_NO_SIGN;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 10 */
		 /* const-wide/high16 v0, -0x8000000000000000L */
		 java.lang.String .valueOf ( v0,v1 );
		 int v1 = 1; // const/4 v1, 0x1
		 (( java.lang.String ) v0 ).substring ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
		 /* .line 11 */
		 /* const-wide v0, 0x7fffffffffffffffL */
		 java.lang.String .valueOf ( v0,v1 );
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static final Boolean inLongRange ( java.lang.String p0, Boolean p1 ) {
		 /* .locals 8 */
		 /* .param p0, "numberStr" # Ljava/lang/String; */
		 /* .param p1, "negative" # Z */
		 /* .prologue */
		 int v4 = 1; // const/4 v4, 0x1
		 int v5 = 0; // const/4 v5, 0x0
		 /* .line 96 */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 v2 = org.codehaus.jackson.io.NumberInput.MIN_LONG_STR_NO_SIGN;
			 /* .line 97 */
			 /* .local v2, "cmpStr":Ljava/lang/String; */
		 } // :goto_0
		 v1 = 		 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
		 /* .line 98 */
		 /* .local v1, "cmpLen":I */
		 v0 = 		 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
		 /* .line 99 */
		 /* .local v0, "actualLen":I */
		 /* if-ge v0, v1, :cond_2 */
		 /* .line 108 */
	 } // :cond_0
} // :goto_1
/* .line 96 */
} // .end local v0 # "actualLen":I
} // .end local v1 # "cmpLen":I
} // .end local v2 # "cmpStr":Ljava/lang/String;
} // :cond_1
v2 = org.codehaus.jackson.io.NumberInput.MAX_LONG_STR;
/* .line 100 */
/* .restart local v0 # "actualLen":I */
/* .restart local v1 # "cmpLen":I */
/* .restart local v2 # "cmpStr":Ljava/lang/String; */
} // :cond_2
/* if-le v0, v1, :cond_3 */
/* move v4, v5 */
/* .line 103 */
} // :cond_3
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_2
/* if-ge v3, v1, :cond_0 */
/* .line 104 */
v6 = (( java.lang.String ) p0 ).charAt ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C
v7 = (( java.lang.String ) v2 ).charAt ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C
/* if-le v6, v7, :cond_4 */
/* move v4, v5 */
/* .line 105 */
/* .line 103 */
} // :cond_4
/* add-int/lit8 v3, v3, 0x1 */
} // .end method
public static final Boolean inLongRange ( Object[] p0, Integer p1, Integer p2, Boolean p3 ) {
/* .locals 7 */
/* .param p0, "digitChars" # [C */
/* .param p1, "offset" # I */
/* .param p2, "len" # I */
/* .param p3, "negative" # Z */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 72 */
if ( p3 != null) { // if-eqz p3, :cond_1
v1 = org.codehaus.jackson.io.NumberInput.MIN_LONG_STR_NO_SIGN;
/* .line 73 */
/* .local v1, "cmpStr":Ljava/lang/String; */
} // :goto_0
v0 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* .line 74 */
/* .local v0, "cmpLen":I */
/* if-ge p2, v0, :cond_2 */
/* .line 82 */
} // :cond_0
} // :goto_1
/* .line 72 */
} // .end local v0 # "cmpLen":I
} // .end local v1 # "cmpStr":Ljava/lang/String;
} // :cond_1
v1 = org.codehaus.jackson.io.NumberInput.MAX_LONG_STR;
/* .line 75 */
/* .restart local v0 # "cmpLen":I */
/* .restart local v1 # "cmpStr":Ljava/lang/String; */
} // :cond_2
/* if-le p2, v0, :cond_3 */
/* move v3, v4 */
/* .line 77 */
} // :cond_3
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i":I */
} // :goto_2
/* if-ge v2, v0, :cond_0 */
/* .line 78 */
/* add-int v5, p1, v2 */
/* aget-char v5, p0, v5 */
v6 = (( java.lang.String ) v1 ).charAt ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C
/* if-le v5, v6, :cond_4 */
/* move v3, v4 */
/* .line 79 */
/* .line 77 */
} // :cond_4
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
public static final Integer parseInt ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .param p0, "digitChars" # [C */
/* .param p1, "offset" # I */
/* .param p2, "len" # I */
/* .prologue */
/* .line 22 */
/* aget-char v1, p0, p1 */
/* add-int/lit8 v0, v1, -0x30 */
/* .line 23 */
/* .local v0, "num":I */
/* add-int/2addr p2, p1 */
/* .line 25 */
/* add-int/lit8 p1, p1, 0x1 */
/* if-ge p1, p2, :cond_0 */
/* .line 26 */
/* mul-int/lit8 v1, v0, 0xa */
/* aget-char v2, p0, p1 */
/* add-int/lit8 v2, v2, -0x30 */
/* add-int v0, v1, v2 */
/* .line 27 */
/* add-int/lit8 p1, p1, 0x1 */
/* if-ge p1, p2, :cond_0 */
/* .line 28 */
/* mul-int/lit8 v1, v0, 0xa */
/* aget-char v2, p0, p1 */
/* add-int/lit8 v2, v2, -0x30 */
/* add-int v0, v1, v2 */
/* .line 29 */
/* add-int/lit8 p1, p1, 0x1 */
/* if-ge p1, p2, :cond_0 */
/* .line 30 */
/* mul-int/lit8 v1, v0, 0xa */
/* aget-char v2, p0, p1 */
/* add-int/lit8 v2, v2, -0x30 */
/* add-int v0, v1, v2 */
/* .line 31 */
/* add-int/lit8 p1, p1, 0x1 */
/* if-ge p1, p2, :cond_0 */
/* .line 32 */
/* mul-int/lit8 v1, v0, 0xa */
/* aget-char v2, p0, p1 */
/* add-int/lit8 v2, v2, -0x30 */
/* add-int v0, v1, v2 */
/* .line 33 */
/* add-int/lit8 p1, p1, 0x1 */
/* if-ge p1, p2, :cond_0 */
/* .line 34 */
/* mul-int/lit8 v1, v0, 0xa */
/* aget-char v2, p0, p1 */
/* add-int/lit8 v2, v2, -0x30 */
/* add-int v0, v1, v2 */
/* .line 35 */
/* add-int/lit8 p1, p1, 0x1 */
/* if-ge p1, p2, :cond_0 */
/* .line 36 */
/* mul-int/lit8 v1, v0, 0xa */
/* aget-char v2, p0, p1 */
/* add-int/lit8 v2, v2, -0x30 */
/* add-int v0, v1, v2 */
/* .line 37 */
/* add-int/lit8 p1, p1, 0x1 */
/* if-ge p1, p2, :cond_0 */
/* .line 38 */
/* mul-int/lit8 v1, v0, 0xa */
/* aget-char v2, p0, p1 */
/* add-int/lit8 v2, v2, -0x30 */
/* add-int v0, v1, v2 */
/* .line 39 */
/* add-int/lit8 p1, p1, 0x1 */
/* if-ge p1, p2, :cond_0 */
/* .line 40 */
/* mul-int/lit8 v1, v0, 0xa */
/* aget-char v2, p0, p1 */
/* add-int/lit8 v2, v2, -0x30 */
/* add-int v0, v1, v2 */
/* .line 49 */
} // :cond_0
} // .end method
public static final Long parseLong ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 7 */
/* .param p0, "digitChars" # [C */
/* .param p1, "offset" # I */
/* .param p2, "len" # I */
/* .prologue */
/* .line 55 */
/* add-int/lit8 v0, p2, -0x9 */
/* .line 56 */
/* .local v0, "len1":I */
v3 = org.codehaus.jackson.io.NumberInput .parseInt ( p0,p1,v0 );
/* int-to-long v3, v3 */
/* const-wide/32 v5, 0x3b9aca00 */
/* mul-long v1, v3, v5 */
/* .line 57 */
/* .local v1, "val":J */
/* add-int v3, p1, v0 */
/* const/16 v4, 0x9 */
v3 = org.codehaus.jackson.io.NumberInput .parseInt ( p0,v3,v4 );
/* int-to-long v3, v3 */
/* add-long/2addr v3, v1 */
/* return-wide v3 */
} // .end method
