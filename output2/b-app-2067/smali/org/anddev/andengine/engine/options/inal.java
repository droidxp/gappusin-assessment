public class inal extends java.lang.Enum {
	 /* # static fields */
	 public static final org.anddev.andengine.engine.options.WakeLockOptions BRIGHT;
	 private static final org.anddev.andengine.engine.options.WakeLockOptions ENUM$VALUES; //synthetic
	 public static final org.anddev.andengine.engine.options.WakeLockOptions SCREEN_BRIGHT;
	 public static final org.anddev.andengine.engine.options.WakeLockOptions SCREEN_DIM;
	 public static final org.anddev.andengine.engine.options.WakeLockOptions SCREEN_ON;
	 /* # instance fields */
	 private final Integer mFlag;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 7 */
		 int v6 = 3; // const/4 v6, 0x3
		 int v5 = 2; // const/4 v5, 0x2
		 int v4 = 1; // const/4 v4, 0x1
		 int v3 = 0; // const/4 v3, 0x0
		 /* new-instance v0, Lorg/anddev/andengine/engine/options/WakeLockOptions; */
		 final String v1 = "BRIGHT"; // const-string v1, "BRIGHT"
		 /* const/16 v2, 0x1a */
		 /* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/options/WakeLockOptions;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lorg/anddev/andengine/engine/options/WakeLockOptions; */
		 final String v1 = "SCREEN_BRIGHT"; // const-string v1, "SCREEN_BRIGHT"
		 /* const/16 v2, 0xa */
		 /* invoke-direct {v0, v1, v4, v2}, Lorg/anddev/andengine/engine/options/WakeLockOptions;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lorg/anddev/andengine/engine/options/WakeLockOptions; */
		 final String v1 = "SCREEN_DIM"; // const-string v1, "SCREEN_DIM"
		 int v2 = 6; // const/4 v2, 0x6
		 /* invoke-direct {v0, v1, v5, v2}, Lorg/anddev/andengine/engine/options/WakeLockOptions;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lorg/anddev/andengine/engine/options/WakeLockOptions; */
		 final String v1 = "SCREEN_ON"; // const-string v1, "SCREEN_ON"
		 int v2 = -1; // const/4 v2, -0x1
		 /* invoke-direct {v0, v1, v6, v2}, Lorg/anddev/andengine/engine/options/WakeLockOptions;-><init>(Ljava/lang/String;II)V */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [Lorg/anddev/andengine/engine/options/WakeLockOptions; */
		 v1 = org.anddev.andengine.engine.options.WakeLockOptions.BRIGHT;
		 /* aput-object v1, v0, v3 */
		 v1 = org.anddev.andengine.engine.options.WakeLockOptions.SCREEN_BRIGHT;
		 /* aput-object v1, v0, v4 */
		 v1 = org.anddev.andengine.engine.options.WakeLockOptions.SCREEN_DIM;
		 /* aput-object v1, v0, v5 */
		 v1 = org.anddev.andengine.engine.options.WakeLockOptions.SCREEN_ON;
		 /* aput-object v1, v0, v6 */
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
		 /* iput p3, p0, Lorg/anddev/andengine/engine/options/WakeLockOptions;->mFlag:I */
		 return;
	 } // .end method
	 public static org.anddev.andengine.engine.options.WakeLockOptions valueOf ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* const-class v0, Lorg/anddev/andengine/engine/options/WakeLockOptions; */
		 java.lang.Enum .valueOf ( v0,p0 );
		 /* check-cast p0, Lorg/anddev/andengine/engine/options/WakeLockOptions; */
	 } // .end method
	 public static org.anddev.andengine.engine.options.WakeLockOptions values ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = org.anddev.andengine.engine.options.WakeLockOptions.ENUM$VALUES;
		 /* array-length v1, v0 */
		 /* new-array v2, v1, [Lorg/anddev/andengine/engine/options/WakeLockOptions; */
		 java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
	 } // .end method
	 /* # virtual methods */
	 public final Integer getFlag ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/options/WakeLockOptions;->mFlag:I */
	 } // .end method
