public abstract class org.anddev.andengine.entity.scene.background.BaseBackground implements org.anddev.andengine.entity.scene.background.IBackground {
	 /* # interfaces */
	 /* # static fields */
	 private static final Integer BACKGROUNDMODIFIERS_CAPACITY_DEFAULT;
	 /* # instance fields */
	 private final org.anddev.andengine.util.modifier.ModifierList mBackgroundModifiers;
	 /* # direct methods */
	 public org.anddev.andengine.entity.scene.background.BaseBackground ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ModifierList; */
		 int v1 = 4; // const/4 v1, 0x4
		 /* invoke-direct {v0, p0, v1}, Lorg/anddev/andengine/util/modifier/ModifierList;-><init>(Ljava/lang/Object;I)V */
		 this.mBackgroundModifiers = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void addBackgroundModifier ( org.anddev.andengine.util.modifier.IModifier p0 ) {
		 /* .locals 1 */
		 v0 = this.mBackgroundModifiers;
		 (( org.anddev.andengine.util.modifier.ModifierList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/modifier/ModifierList;->add(Ljava/lang/Object;)Z
		 return;
	 } // .end method
	 public void clearBackgroundModifiers ( ) {
		 /* .locals 1 */
		 v0 = this.mBackgroundModifiers;
		 (( org.anddev.andengine.util.modifier.ModifierList ) v0 ).clear ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/modifier/ModifierList;->clear()V
		 return;
	 } // .end method
	 public void onUpdate ( Float p0 ) {
		 /* .locals 1 */
		 v0 = this.mBackgroundModifiers;
		 (( org.anddev.andengine.util.modifier.ModifierList ) v0 ).onUpdate ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/modifier/ModifierList;->onUpdate(F)V
		 return;
	 } // .end method
	 public Boolean removeBackgroundModifier ( org.anddev.andengine.util.modifier.IModifier p0 ) {
		 /* .locals 1 */
		 v0 = this.mBackgroundModifiers;
		 v0 = 		 (( org.anddev.andengine.util.modifier.ModifierList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/modifier/ModifierList;->remove(Ljava/lang/Object;)Z
	 } // .end method
	 public void reset ( ) {
		 /* .locals 1 */
		 v0 = this.mBackgroundModifiers;
		 (( org.anddev.andengine.util.modifier.ModifierList ) v0 ).reset ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/modifier/ModifierList;->reset()V
		 return;
	 } // .end method
