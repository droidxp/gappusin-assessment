public class inal extends java.lang.Enum implements java.lang.Comparable {
	 /* # interfaces */
	 /* # static fields */
	 public static org.anddev.andengine.util.Debug$DebugLevel ALL;
	 public static final org.anddev.andengine.util.Debug$DebugLevel DEBUG;
	 private static final org.anddev.andengine.util.Debug$DebugLevel ENUM$VALUES; //synthetic
	 public static final org.anddev.andengine.util.Debug$DebugLevel ERROR;
	 public static final org.anddev.andengine.util.Debug$DebugLevel INFO;
	 public static final org.anddev.andengine.util.Debug$DebugLevel NONE;
	 public static final org.anddev.andengine.util.Debug$DebugLevel VERBOSE;
	 public static final org.anddev.andengine.util.Debug$DebugLevel WARNING;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 8 */
		 int v7 = 4; // const/4 v7, 0x4
		 int v6 = 3; // const/4 v6, 0x3
		 int v5 = 2; // const/4 v5, 0x2
		 int v4 = 1; // const/4 v4, 0x1
		 int v3 = 0; // const/4 v3, 0x0
		 /* new-instance v0, Lorg/anddev/andengine/util/Debug$DebugLevel; */
		 final String v1 = "NONE"; // const-string v1, "NONE"
		 /* invoke-direct {v0, v1, v3}, Lorg/anddev/andengine/util/Debug$DebugLevel;-><init>(Ljava/lang/String;I)V */
		 /* new-instance v0, Lorg/anddev/andengine/util/Debug$DebugLevel; */
		 final String v1 = "ERROR"; // const-string v1, "ERROR"
		 /* invoke-direct {v0, v1, v4}, Lorg/anddev/andengine/util/Debug$DebugLevel;-><init>(Ljava/lang/String;I)V */
		 /* new-instance v0, Lorg/anddev/andengine/util/Debug$DebugLevel; */
		 final String v1 = "WARNING"; // const-string v1, "WARNING"
		 /* invoke-direct {v0, v1, v5}, Lorg/anddev/andengine/util/Debug$DebugLevel;-><init>(Ljava/lang/String;I)V */
		 /* new-instance v0, Lorg/anddev/andengine/util/Debug$DebugLevel; */
		 final String v1 = "INFO"; // const-string v1, "INFO"
		 /* invoke-direct {v0, v1, v6}, Lorg/anddev/andengine/util/Debug$DebugLevel;-><init>(Ljava/lang/String;I)V */
		 /* new-instance v0, Lorg/anddev/andengine/util/Debug$DebugLevel; */
		 final String v1 = "DEBUG"; // const-string v1, "DEBUG"
		 /* invoke-direct {v0, v1, v7}, Lorg/anddev/andengine/util/Debug$DebugLevel;-><init>(Ljava/lang/String;I)V */
		 /* new-instance v0, Lorg/anddev/andengine/util/Debug$DebugLevel; */
		 final String v1 = "VERBOSE"; // const-string v1, "VERBOSE"
		 int v2 = 5; // const/4 v2, 0x5
		 /* invoke-direct {v0, v1, v2}, Lorg/anddev/andengine/util/Debug$DebugLevel;-><init>(Ljava/lang/String;I)V */
		 int v0 = 6; // const/4 v0, 0x6
		 /* new-array v0, v0, [Lorg/anddev/andengine/util/Debug$DebugLevel; */
		 v1 = org.anddev.andengine.util.Debug$DebugLevel.NONE;
		 /* aput-object v1, v0, v3 */
		 v1 = org.anddev.andengine.util.Debug$DebugLevel.ERROR;
		 /* aput-object v1, v0, v4 */
		 v1 = org.anddev.andengine.util.Debug$DebugLevel.WARNING;
		 /* aput-object v1, v0, v5 */
		 v1 = org.anddev.andengine.util.Debug$DebugLevel.INFO;
		 /* aput-object v1, v0, v6 */
		 v1 = org.anddev.andengine.util.Debug$DebugLevel.DEBUG;
		 /* aput-object v1, v0, v7 */
		 int v1 = 5; // const/4 v1, 0x5
		 v2 = org.anddev.andengine.util.Debug$DebugLevel.VERBOSE;
		 /* aput-object v2, v0, v1 */
		 v0 = org.anddev.andengine.util.Debug$DebugLevel.VERBOSE;
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
		 return;
	 } // .end method
	 static Boolean access$2 ( org.anddev.andengine.util.Debug$DebugLevel p0, org.anddev.andengine.util.Debug$DebugLevel p1 ) { //synthethic
		 /* .locals 1 */
		 v0 = 		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/util/Debug$DebugLevel;->isSameOrLessThan(Lorg/anddev/andengine/util/Debug$DebugLevel;)Z */
	 } // .end method
	 private Boolean isSameOrLessThan ( org.anddev.andengine.util.Debug$DebugLevel p0 ) {
		 /* .locals 1 */
		 v0 = 		 (( org.anddev.andengine.util.Debug$DebugLevel ) p0 ).compareTo ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/Debug$DebugLevel;->compareTo(Ljava/lang/Enum;)I
		 /* if-ltz v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static org.anddev.andengine.util.Debug$DebugLevel valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* const-class v0, Lorg/anddev/andengine/util/Debug$DebugLevel; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Lorg/anddev/andengine/util/Debug$DebugLevel; */
} // .end method
public static org.anddev.andengine.util.Debug$DebugLevel values ( ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
v0 = org.anddev.andengine.util.Debug$DebugLevel.ENUM$VALUES;
/* array-length v1, v0 */
/* new-array v2, v1, [Lorg/anddev/andengine/util/Debug$DebugLevel; */
java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
} // .end method
