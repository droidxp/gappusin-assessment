public class org.anddev.andengine.util.path.astar.ManhattanHeuristic implements org.anddev.andengine.util.path.astar.IAStarHeuristic {
	 /* # interfaces */
	 /* # direct methods */
	 public org.anddev.andengine.util.path.astar.ManhattanHeuristic ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float getExpectedRestCost ( org.anddev.andengine.util.path.ITiledMap p0, java.lang.Object p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
		 /* .locals 2 */
		 /* sub-int v0, p3, p5 */
		 v0 = 		 java.lang.Math .abs ( v0 );
		 /* sub-int v1, p5, p6 */
		 v1 = 		 java.lang.Math .abs ( v1 );
		 /* add-int/2addr v0, v1 */
		 /* int-to-float v0, v0 */
	 } // .end method
