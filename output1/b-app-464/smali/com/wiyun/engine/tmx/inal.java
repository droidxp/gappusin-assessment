public class inal extends java.lang.Enum {
	 /* # static fields */
	 private static final com.wiyun.engine.tmx.TMXObject$Type ENUM$VALUES; //synthetic
	 public static final com.wiyun.engine.tmx.TMXObject$Type NORMAL;
	 public static final com.wiyun.engine.tmx.TMXObject$Type POLYGON;
	 public static final com.wiyun.engine.tmx.TMXObject$Type POLYLINE;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 5 */
		 int v4 = 2; // const/4 v4, 0x2
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* new-instance v0, Lcom/wiyun/engine/tmx/TMXObject$Type; */
		 final String v1 = "NORMAL"; // const-string v1, "NORMAL"
		 /* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/tmx/TMXObject$Type;-><init>(Ljava/lang/String;I)V */
		 /* new-instance v0, Lcom/wiyun/engine/tmx/TMXObject$Type; */
		 final String v1 = "POLYGON"; // const-string v1, "POLYGON"
		 /* invoke-direct {v0, v1, v3}, Lcom/wiyun/engine/tmx/TMXObject$Type;-><init>(Ljava/lang/String;I)V */
		 /* new-instance v0, Lcom/wiyun/engine/tmx/TMXObject$Type; */
		 final String v1 = "POLYLINE"; // const-string v1, "POLYLINE"
		 /* invoke-direct {v0, v1, v4}, Lcom/wiyun/engine/tmx/TMXObject$Type;-><init>(Ljava/lang/String;I)V */
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [Lcom/wiyun/engine/tmx/TMXObject$Type; */
		 v1 = com.wiyun.engine.tmx.TMXObject$Type.NORMAL;
		 /* aput-object v1, v0, v2 */
		 v1 = com.wiyun.engine.tmx.TMXObject$Type.POLYGON;
		 /* aput-object v1, v0, v3 */
		 v1 = com.wiyun.engine.tmx.TMXObject$Type.POLYLINE;
		 /* aput-object v1, v0, v4 */
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.tmx.TMXObject$Type valueOf ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* const-class v0, Lcom/wiyun/engine/tmx/TMXObject$Type; */
		 java.lang.Enum .valueOf ( v0,p0 );
		 /* check-cast v0, Lcom/wiyun/engine/tmx/TMXObject$Type; */
	 } // .end method
	 public static com.wiyun.engine.tmx.TMXObject$Type values ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = com.wiyun.engine.tmx.TMXObject$Type.ENUM$VALUES;
		 /* array-length v1, v0 */
		 /* new-array v2, v1, [Lcom/wiyun/engine/tmx/TMXObject$Type; */
		 java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
	 } // .end method
