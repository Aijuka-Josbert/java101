def timer(seconds):
    start_time = time.time()
    time.sleep(seconds)
    end_time = time.time()
    elapsed_time = end_time - start_time
    print(f"Elapsed time: {elapsed_time} seconds")
