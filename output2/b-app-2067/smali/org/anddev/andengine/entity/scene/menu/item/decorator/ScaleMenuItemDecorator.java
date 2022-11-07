public class org.anddev.andengine.entity.scene.menu.item.decorator.ScaleMenuItemDecorator extends org.anddev.andengine.entity.scene.menu.item.decorator.BaseMenuItemDecorator {
	 /* # instance fields */
	 private final Float mSelectedScale;
	 private final Float mUnselectedScale;
	 /* # direct methods */
	 public org.anddev.andengine.entity.scene.menu.item.decorator.ScaleMenuItemDecorator ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/entity/scene/menu/item/decorator/BaseMenuItemDecorator;-><init>(Lorg/anddev/andengine/entity/scene/menu/item/IMenuItem;)V */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/scene/menu/item/decorator/ScaleMenuItemDecorator;->mSelectedScale:F */
		 /* iput p3, p0, Lorg/anddev/andengine/entity/scene/menu/item/decorator/ScaleMenuItemDecorator;->mUnselectedScale:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onMenuItemReset ( org.anddev.andengine.entity.scene.menu.item.IMenuItem p0 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/scene/menu/item/decorator/ScaleMenuItemDecorator;->mUnselectedScale:F */
		 (( org.anddev.andengine.entity.scene.menu.item.decorator.ScaleMenuItemDecorator ) p0 ).setScale ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/scene/menu/item/decorator/ScaleMenuItemDecorator;->setScale(F)V
		 return;
	 } // .end method
	 public void onMenuItemSelected ( org.anddev.andengine.entity.scene.menu.item.IMenuItem p0 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/scene/menu/item/decorator/ScaleMenuItemDecorator;->mSelectedScale:F */
		 (( org.anddev.andengine.entity.scene.menu.item.decorator.ScaleMenuItemDecorator ) p0 ).setScale ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/scene/menu/item/decorator/ScaleMenuItemDecorator;->setScale(F)V
		 return;
	 } // .end method
	 public void onMenuItemUnselected ( org.anddev.andengine.entity.scene.menu.item.IMenuItem p0 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/scene/menu/item/decorator/ScaleMenuItemDecorator;->mUnselectedScale:F */
		 (( org.anddev.andengine.entity.scene.menu.item.decorator.ScaleMenuItemDecorator ) p0 ).setScale ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/scene/menu/item/decorator/ScaleMenuItemDecorator;->setScale(F)V
		 return;
	 } // .end method
