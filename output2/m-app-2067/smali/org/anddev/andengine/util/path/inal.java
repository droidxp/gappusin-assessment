public class inal extends java.lang.Enum {
	 /* # static fields */
	 public static final org.anddev.andengine.util.path.Direction DOWN;
	 private static final org.anddev.andengine.util.path.Direction ENUM$VALUES; //synthetic
	 public static final org.anddev.andengine.util.path.Direction LEFT;
	 public static final org.anddev.andengine.util.path.Direction RIGHT;
	 public static final org.anddev.andengine.util.path.Direction UP;
	 /* # instance fields */
	 private final Integer mDeltaX;
	 private final Integer mDeltaY;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 7 */
		 int v6 = 3; // const/4 v6, 0x3
		 int v5 = 2; // const/4 v5, 0x2
		 int v4 = -1; // const/4 v4, -0x1
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* new-instance v0, Lorg/anddev/andengine/util/path/Direction; */
		 final String v1 = "UP"; // const-string v1, "UP"
		 /* invoke-direct {v0, v1, v2, v2, v4}, Lorg/anddev/andengine/util/path/Direction;-><init>(Ljava/lang/String;III)V */
		 /* new-instance v0, Lorg/anddev/andengine/util/path/Direction; */
		 final String v1 = "DOWN"; // const-string v1, "DOWN"
		 /* invoke-direct {v0, v1, v3, v2, v3}, Lorg/anddev/andengine/util/path/Direction;-><init>(Ljava/lang/String;III)V */
		 /* new-instance v0, Lorg/anddev/andengine/util/path/Direction; */
		 final String v1 = "LEFT"; // const-string v1, "LEFT"
		 /* invoke-direct {v0, v1, v5, v4, v2}, Lorg/anddev/andengine/util/path/Direction;-><init>(Ljava/lang/String;III)V */
		 /* new-instance v0, Lorg/anddev/andengine/util/path/Direction; */
		 final String v1 = "RIGHT"; // const-string v1, "RIGHT"
		 /* invoke-direct {v0, v1, v6, v3, v2}, Lorg/anddev/andengine/util/path/Direction;-><init>(Ljava/lang/String;III)V */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [Lorg/anddev/andengine/util/path/Direction; */
		 v1 = org.anddev.andengine.util.path.Direction.UP;
		 /* aput-object v1, v0, v2 */
		 v1 = org.anddev.andengine.util.path.Direction.DOWN;
		 /* aput-object v1, v0, v3 */
		 v1 = org.anddev.andengine.util.path.Direction.LEFT;
		 /* aput-object v1, v0, v5 */
		 v1 = org.anddev.andengine.util.path.Direction.RIGHT;
		 /* aput-object v1, v0, v6 */
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
		 /* iput p3, p0, Lorg/anddev/andengine/util/path/Direction;->mDeltaX:I */
		 /* iput p4, p0, Lorg/anddev/andengine/util/path/Direction;->mDeltaY:I */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.path.Direction fromDelta ( Integer p0, Integer p1 ) {
		 /* .locals 2 */
		 int v1 = 1; // const/4 v1, 0x1
		 int v0 = -1; // const/4 v0, -0x1
		 /* if-nez p0, :cond_1 */
		 /* if-ne p1, v1, :cond_0 */
		 v0 = org.anddev.andengine.util.path.Direction.DOWN;
	 } // :goto_0
} // :cond_0
/* if-ne p1, v0, :cond_3 */
v0 = org.anddev.andengine.util.path.Direction.UP;
} // :cond_1
/* if-nez p1, :cond_3 */
/* if-ne p0, v1, :cond_2 */
v0 = org.anddev.andengine.util.path.Direction.RIGHT;
} // :cond_2
/* if-ne p0, v0, :cond_3 */
v0 = org.anddev.andengine.util.path.Direction.LEFT;
} // :cond_3
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V */
/* throw v0 */
} // .end method
public static org.anddev.andengine.util.path.Direction valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* const-class v0, Lorg/anddev/andengine/util/path/Direction; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Lorg/anddev/andengine/util/path/Direction; */
} // .end method
public static org.anddev.andengine.util.path.Direction values ( ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
v0 = org.anddev.andengine.util.path.Direction.ENUM$VALUES;
/* array-length v1, v0 */
/* new-array v2, v1, [Lorg/anddev/andengine/util/path/Direction; */
java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
} // .end method
/* # virtual methods */
public final Integer getDeltaX ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/util/path/Direction;->mDeltaX:I */
} // .end method
public final Integer getDeltaY ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/util/path/Direction;->mDeltaY:I */
} // .end method
