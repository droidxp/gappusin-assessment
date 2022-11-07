class org.apache.commons.codec.digest.B64 {
	 /* .source "B64.java" */
	 /* # static fields */
	 static final java.lang.String B64T;
	 /* # direct methods */
	 org.apache.commons.codec.digest.B64 ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static void b64from24bit ( Object p0, Object p1, Object p2, Integer p3, java.lang.StringBuilder p4 ) {
		 /* .locals 6 */
		 /* .param p0, "b2" # B */
		 /* .param p1, "b1" # B */
		 /* .param p2, "b0" # B */
		 /* .param p3, "outLen" # I */
		 /* .param p4, "buffer" # Ljava/lang/StringBuilder; */
		 /* .prologue */
		 /* .line 57 */
		 /* shl-int/lit8 v3, p0, 0x10 */
		 /* const v4, 0xffffff */
		 /* and-int/2addr v3, v4 */
		 /* shl-int/lit8 v4, p1, 0x8 */
		 /* const v5, 0xffff */
		 /* and-int/2addr v4, v5 */
		 /* or-int/2addr v3, v4 */
		 /* and-int/lit16 v4, p2, 0xff */
		 /* or-int v2, v3, v4 */
		 /* .line 59 */
		 /* .local v2, "w":I */
		 /* move v0, p3 */
		 /* .local v0, "n":I */
		 /* move v1, v0 */
		 /* .line 60 */
	 } // .end local v0 # "n":I
	 /* .local v1, "n":I */
} // :goto_0
/* add-int/lit8 v0, v1, -0x1 */
} // .end local v1 # "n":I
/* .restart local v0 # "n":I */
/* if-lez v1, :cond_0 */
/* .line 61 */
final String v3 = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; // const-string v3, "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
/* and-int/lit8 v4, v2, 0x3f */
v3 = (( java.lang.String ) v3 ).charAt ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C
(( java.lang.StringBuilder ) p4 ).append ( v3 ); // invoke-virtual {p4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 62 */
/* shr-int/lit8 v2, v2, 0x6 */
/* move v1, v0 */
} // .end local v0 # "n":I
/* .restart local v1 # "n":I */
/* .line 64 */
} // .end local v1 # "n":I
/* .restart local v0 # "n":I */
} // :cond_0
return;
} // .end method
static java.lang.String getRandomSalt ( Integer p0 ) {
/* .locals 5 */
/* .param p0, "num" # I */
/* .prologue */
/* .line 73 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 74 */
/* .local v1, "saltString":Ljava/lang/StringBuilder; */
int v0 = 1; // const/4 v0, 0x1
/* .local v0, "i":I */
} // :goto_0
/* if-gt v0, p0, :cond_0 */
/* .line 75 */
final String v2 = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; // const-string v2, "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
/* new-instance v3, Ljava/util/Random; */
/* invoke-direct {v3}, Ljava/util/Random;-><init>()V */
final String v4 = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; // const-string v4, "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
v3 = (( java.util.Random ) v3 ).nextInt ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I
v2 = (( java.lang.String ) v2 ).charAt ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 74 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 77 */
} // :cond_0
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
