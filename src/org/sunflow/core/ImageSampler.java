package org.sunflow.core;

/**
 * This interface represents an image sampling algorithm capable of rendering
 * the entire image. Implementations are responsible for anti-aliasing and
 * filtering.
 */
public interface ImageSampler {

    /**
     * Prepare the sampler for rendering an image of w x h pixels
     *
     * @param w width of the image
     * @param h height of the image
     */
    public boolean prepare(Options options, Scene scene, int w, int h);

    /**
     * Prepare the sampler for rendering a subimage x0 x y0, size w0 x h0, total size w x h pixels
     *
     * @param w width of the image
     * @param h height of the image
     */
    public boolean prepare(Options options, Scene scene, int x0, int y0, int w0, int h0, int w, int h);

    /**
     * Render the image to the specified display. The sampler can assume the
     * display has been opened and that it will be closed after the method
     * returns.
     *
     * @param display Display driver to send image data to
     */
    public void render(Display display);
}