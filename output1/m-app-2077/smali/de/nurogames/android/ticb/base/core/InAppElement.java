public class de.nurogames.android.ticb.base.core.InAppElement {
	 /* .source "InAppElement.java" */
	 /* # instance fields */
	 private android.graphics.Bitmap m_icon;
	 private java.lang.String m_item_desc;
	 private Integer m_item_id;
	 private java.lang.String m_item_name;
	 private java.lang.String m_item_price;
	 private Boolean m_item_selectable;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.core.InAppElement ( ) {
		 /* .locals 0 */
		 /* .param p1, "app_id" # I */
		 /* .param p2, "icon" # Landroid/graphics/Bitmap; */
		 /* .param p3, "app_name" # Ljava/lang/String; */
		 /* .param p4, "app_price" # Ljava/lang/String; */
		 /* .param p5, "app_desc" # Ljava/lang/String; */
		 /* .param p6, "selectable" # Z */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 31 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/core/InAppElement;->m_item_id:I */
		 /* .line 32 */
		 this.m_icon = p2;
		 /* .line 33 */
		 this.m_item_name = p3;
		 /* .line 34 */
		 this.m_item_price = p4;
		 /* .line 35 */
		 this.m_item_desc = p5;
		 /* .line 36 */
		 /* iput-boolean p6, p0, Lde/nurogames/android/ticb/base/core/InAppElement;->m_item_selectable:Z */
		 /* .line 37 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String Desc ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 42 */
		 v0 = this.m_item_desc;
	 } // .end method
	 public Integer ID ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 40 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/core/InAppElement;->m_item_id:I */
	 } // .end method
	 public android.graphics.Bitmap Icon ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 44 */
		 v0 = this.m_icon;
	 } // .end method
	 public java.lang.String Name ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 41 */
		 v0 = this.m_item_name;
	 } // .end method
	 public java.lang.String Price ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 43 */
		 v0 = this.m_item_price;
	 } // .end method
	 public Boolean Selectable ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 45 */
		 /* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/core/InAppElement;->m_item_selectable:Z */
	 } // .end method
