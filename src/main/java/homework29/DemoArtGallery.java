package homework29;

public class DemoArtGallery {
    public static void main(String[] args) {
        Painting painting = new Painting("Malevic","Black quadrat", PaintType.ACRYLIC, "150x150" );
        Artwork sculpture =  new Sculpture("Michelangelo", "David", 300, Material.MARBLE);
        ArtGallery artGalleryManager =  new ArtGallery();
        artGalleryManager.addArtwork(painting);
        artGalleryManager.addArtwork(sculpture);
        artGalleryManager.displayAllArtworks();

        artGalleryManager.removeArtwork(sculpture);

        artGalleryManager.displayAllArtworks();


    }
}
