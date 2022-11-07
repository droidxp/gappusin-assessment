public class org.anddev.andengine.util.ViewUtils {
	 /* # direct methods */
	 public org.anddev.andengine.util.ViewUtils ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static android.view.View inflate ( android.content.Context p0, Integer p1 ) {
		 /* .locals 2 */
		 android.view.LayoutInflater .from ( p0 );
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.view.LayoutInflater ) v0 ).inflate ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
	 } // .end method
	 public static android.view.View inflate ( android.content.Context p0, Integer p1, android.view.ViewGroup p2 ) {
		 /* .locals 2 */
		 android.view.LayoutInflater .from ( p0 );
		 int v1 = 1; // const/4 v1, 0x1
		 (( android.view.LayoutInflater ) v0 ).inflate ( p1, p2, v1 ); // invoke-virtual {v0, p1, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
	 } // .end method
