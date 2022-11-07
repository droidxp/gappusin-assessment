public class com.wiyun.engine.utils.ResolutionIndependent {
	 /* .source "ResolutionIndependent.java" */
	 /* # direct methods */
	 public com.wiyun.engine.utils.ResolutionIndependent ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYPoint resolve ( com.wiyun.engine.types.WYPoint p0 ) {
		 /* .locals 1 */
		 /* .param p0, "p" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 19 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 v0 = 		 com.wiyun.engine.utils.ResolutionIndependent .resolveDp ( v0 );
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* .line 20 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 v0 = 		 com.wiyun.engine.utils.ResolutionIndependent .resolveDp ( v0 );
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* .line 21 */
	 } // .end method
	 public static com.wiyun.engine.types.WYRect resolve ( com.wiyun.engine.types.WYRect p0 ) {
		 /* .locals 1 */
		 /* .param p0, "r" # Lcom/wiyun/engine/types/WYRect; */
		 /* .prologue */
		 /* .line 45 */
		 v0 = this.origin;
		 com.wiyun.engine.utils.ResolutionIndependent .resolve ( v0 );
		 this.origin = v0;
		 /* .line 46 */
		 v0 = this.size;
		 com.wiyun.engine.utils.ResolutionIndependent .resolve ( v0 );
		 this.size = v0;
		 /* .line 47 */
	 } // .end method
	 public static final com.wiyun.engine.types.WYSize resolve ( com.wiyun.engine.types.WYSize p0 ) {
		 /* .locals 1 */
		 /* .param p0, "s" # Lcom/wiyun/engine/types/WYSize; */
		 /* .prologue */
		 /* .line 32 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYSize;->width:F */
		 v0 = 		 com.wiyun.engine.utils.ResolutionIndependent .resolveDp ( v0 );
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYSize;->width:F */
		 /* .line 33 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYSize;->height:F */
		 v0 = 		 com.wiyun.engine.utils.ResolutionIndependent .resolveDp ( v0 );
		 /* iput v0, p0, Lcom/wiyun/engine/types/WYSize;->height:F */
		 /* .line 34 */
	 } // .end method
	 public static native Float resolveDp ( Float p0 ) {
	 } // .end method
	 public static native Float resolveSp ( Float p0 ) {
	 } // .end method
