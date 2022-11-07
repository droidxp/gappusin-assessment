public class com.a.f.c {
	 /* # direct methods */
	 public static java.lang.String a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 5 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
/* new-instance v0, Ljava/lang/String; */
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
com.a.f.c .a ( v3,p1 );
/* invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* sub-long v1, v3, v1 */
} // .end method
public static a ( Object[] p0, java.lang.String p1 ) {
/* .locals 6 */
int v1 = 0; // const/4 v1, 0x0
(( java.lang.String ) p1 ).getBytes ( ); // invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
/* move v0, v1 */
} // :goto_0
/* array-length v2, p0 */
/* if-lt v0, v2, :cond_0 */
} // :cond_0
/* move v2, v1 */
} // :goto_1
/* array-length v4, v3 */
/* if-lt v2, v4, :cond_1 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* aget-byte v4, p0, v0 */
/* aget-byte v5, v3, v2 */
/* xor-int/2addr v4, v5 */
/* int-to-byte v4, v4 */
/* aput-byte v4, p0, v0 */
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
