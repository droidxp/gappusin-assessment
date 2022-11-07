class inal implements com.doodlemobile.basket.util.c {
	 /* # interfaces */
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( android.view.MotionEvent p0, Object p1 ) {
		 /* .locals 5 */
		 int v4 = 1; // const/4 v4, 0x1
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = 		 (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
		 com.doodlemobile.basket.util.e .a ( p2,v0 );
		 com.doodlemobile.basket.util.e .b ( p2,v4 );
		 com.doodlemobile.basket.util.e .a ( p2 );
		 /* aput v3, v0, v3 */
		 com.doodlemobile.basket.util.e .b ( p2 );
		 v1 = 		 (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v1, v2 */
		 /* aput v1, v0, v3 */
		 com.doodlemobile.basket.util.e .b ( p2 );
		 v1 = 		 (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v1, v2 */
		 /* aput v1, v0, v4 */
		 com.doodlemobile.basket.util.e .b ( p2 );
		 int v1 = 2; // const/4 v1, 0x2
		 v2 = 		 (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
		 /* aput v2, v0, v1 */
		 com.doodlemobile.basket.util.e .b ( p2 );
		 int v1 = 3; // const/4 v1, 0x3
		 v2 = 		 (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
		 /* aput v2, v0, v1 */
		 (( android.view.MotionEvent ) p1 ).getEventTime ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J
		 /* move-result-wide v0 */
		 com.doodlemobile.basket.util.e .a ( p2,v0,v1 );
		 return;
	 } // .end method
