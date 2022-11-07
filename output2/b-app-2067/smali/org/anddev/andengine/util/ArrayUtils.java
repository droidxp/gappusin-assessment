public class org.anddev.andengine.util.ArrayUtils {
	 /* # direct methods */
	 public org.anddev.andengine.util.ArrayUtils ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean equals ( Object[] p0, Integer p1, Object[] p2, Integer p3, Integer p4 ) {
		 /* .locals 5 */
		 /* add-int v0, p1, p4 */
		 /* array-length v1, p0 */
		 /* if-le v0, v1, :cond_0 */
		 /* new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException; */
		 /* array-length v1, p0 */
		 /* invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V */
		 /* throw v0 */
	 } // :cond_0
	 /* add-int v1, p3, p4 */
	 /* array-length v2, p2 */
	 /* if-le v1, v2, :cond_1 */
	 /* new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException; */
	 /* array-length v1, p2 */
	 /* invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V */
	 /* throw v0 */
} // :cond_1
/* move v1, p3 */
/* move v2, p1 */
} // :goto_0
/* if-lt v2, v0, :cond_2 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // :cond_2
/* aget-byte v3, p0, v2 */
/* aget-byte v4, p2, v1 */
/* if-eq v3, v4, :cond_3 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_3
/* add-int/lit8 v2, v2, 0x1 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static java.lang.Object random ( java.lang.Object[] p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
v0 = org.anddev.andengine.util.MathUtils .random ( v0,v1 );
/* aget-object v0, p0, v0 */
} // .end method
public static void reverse ( Object[] p0 ) {
/* .locals 5 */
/* if-nez p0, :cond_1 */
} // :cond_0
return;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_0
/* if-le v0, v1, :cond_0 */
/* aget-byte v2, p0, v0 */
/* aget-byte v3, p0, v1 */
/* aput-byte v3, p0, v0 */
/* aput-byte v2, p0, v1 */
/* add-int/lit8 v0, v0, -0x1 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static void reverse ( Double[] p0 ) {
/* .locals 7 */
/* if-nez p0, :cond_1 */
} // :cond_0
return;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* move v6, v1 */
/* move v1, v0 */
/* move v0, v6 */
} // :goto_0
/* if-le v0, v1, :cond_0 */
/* aget-wide v2, p0, v0 */
/* aget-wide v4, p0, v1 */
/* aput-wide v4, p0, v0 */
/* aput-wide v2, p0, v1 */
/* add-int/lit8 v0, v0, -0x1 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static void reverse ( Float[] p0 ) {
/* .locals 5 */
/* if-nez p0, :cond_1 */
} // :cond_0
return;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_0
/* if-le v0, v1, :cond_0 */
/* aget v2, p0, v0 */
/* aget v3, p0, v1 */
/* aput v3, p0, v0 */
/* aput v2, p0, v1 */
/* add-int/lit8 v0, v0, -0x1 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static void reverse ( Integer[] p0 ) {
/* .locals 5 */
/* if-nez p0, :cond_1 */
} // :cond_0
return;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_0
/* if-le v0, v1, :cond_0 */
/* aget v2, p0, v0 */
/* aget v3, p0, v1 */
/* aput v3, p0, v0 */
/* aput v2, p0, v1 */
/* add-int/lit8 v0, v0, -0x1 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static void reverse ( Long[] p0 ) {
/* .locals 7 */
/* if-nez p0, :cond_1 */
} // :cond_0
return;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* move v6, v1 */
/* move v1, v0 */
/* move v0, v6 */
} // :goto_0
/* if-le v0, v1, :cond_0 */
/* aget-wide v2, p0, v0 */
/* aget-wide v4, p0, v1 */
/* aput-wide v4, p0, v0 */
/* aput-wide v2, p0, v1 */
/* add-int/lit8 v0, v0, -0x1 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static void reverse ( java.lang.Object[] p0 ) {
/* .locals 5 */
/* if-nez p0, :cond_1 */
} // :cond_0
return;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_0
/* if-le v0, v1, :cond_0 */
/* aget-object v2, p0, v0 */
/* aget-object v3, p0, v1 */
/* aput-object v3, p0, v0 */
/* aput-object v2, p0, v1 */
/* add-int/lit8 v0, v0, -0x1 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static void reverse ( Object[] p0 ) {
/* .locals 5 */
/* if-nez p0, :cond_1 */
} // :cond_0
return;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_0
/* if-le v0, v1, :cond_0 */
/* aget-short v2, p0, v0 */
/* aget-short v3, p0, v1 */
/* aput-short v3, p0, v0 */
/* aput-short v2, p0, v1 */
/* add-int/lit8 v0, v0, -0x1 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
