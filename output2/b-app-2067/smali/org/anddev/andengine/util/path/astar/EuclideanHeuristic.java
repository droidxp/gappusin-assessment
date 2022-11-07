public class org.anddev.andengine.util.path.astar.EuclideanHeuristic implements org.anddev.andengine.util.path.astar.IAStarHeuristic {
	 /* # interfaces */
	 /* # direct methods */
	 public org.anddev.andengine.util.path.astar.EuclideanHeuristic ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float getExpectedRestCost ( org.anddev.andengine.util.path.ITiledMap p0, java.lang.Object p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
		 /* .locals 2 */
		 /* sub-int v0, p5, p3 */
		 /* int-to-float v0, v0 */
		 /* sub-int v1, p6, p4 */
		 /* int-to-float v1, v1 */
		 /* mul-float/2addr v0, v0 */
		 /* mul-float/2addr v1, v1 */
		 /* add-float/2addr v0, v1 */
		 v0 = 		 android.util.FloatMath .sqrt ( v0 );
	 } // .end method
