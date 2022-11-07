public class com.wiyun.engine.utils.ResolutionIndependent {
	 /* # direct methods */
	 public com.wiyun.engine.utils.ResolutionIndependent ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYPoint resolve ( com.wiyun.engine.types.WYPoint p0 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 v0 = 		 com.wiyun.engine.utils.ResolutionIndependent .resolveDp ( v0 );
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 v0 = 		 com.wiyun.engine.utils.ResolutionIndependent .resolveDp ( v0 );
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
	 } // .end method
	 public static com.wiyun.engine.types.WYRect resolve ( com.wiyun.engine.types.WYRect p0 ) {
		 /* .locals 1 */
		 v0 = this.origin;
		 com.wiyun.engine.utils.ResolutionIndependent .resolve ( v0 );
		 this.origin = v0;
		 v0 = this.size;
		 com.wiyun.engine.utils.ResolutionIndependent .resolve ( v0 );
		 this.size = v0;
	 } // .end method
	 public static final com.wiyun.engine.types.WYSize resolve ( com.wiyun.engine.types.WYSize p0 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYSize;->width:F */
		 v0 = 		 com.wiyun.engine.utils.ResolutionIndependent .resolveDp ( v0 );
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYSize;->width:F */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYSize;->height:F */
		 v0 = 		 com.wiyun.engine.utils.ResolutionIndependent .resolveDp ( v0 );
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYSize;->height:F */
	 } // .end method
	 public static native Float resolveDp ( Float p0 ) {
	 } // .end method
	 public static native Float resolveSp ( Float p0 ) {
	 } // .end method
