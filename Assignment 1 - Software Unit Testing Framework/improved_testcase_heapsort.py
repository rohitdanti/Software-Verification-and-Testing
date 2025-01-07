import unittest
from HeapSort import heapSort
import time

class TestHeapSort(unittest.TestCase):

    def setUp(self):
        print("\nRunning test case...")

    # Improvements

    def test_duplicates_and_stability(self):
        arr = [(2, 'b'), (1, 'a'), (2, 'c')]
        heapSort(arr)
        expected = [(1, 'a'), (2, 'b'), (2, 'c')]
        self.assertNotEqual(arr, expected)

    def test_large_dataset(self):
        arr = list(range(10000, 0, -1))
        expected = list(range(1, 10001))
        heapSort(arr)
        self.assertEqual(arr, expected)

    def test_performance(self):
        arr = list(range(1000000, 0, -1))
        start_time = time.time()
        heapSort(arr)
        end_time = time.time()
        elapsed_time = end_time - start_time
        print(f"Test performance passed. Time taken: {elapsed_time:.2f} seconds.")

    def test_floating_point_numbers(self):
        arr = [3.5, 2.1, 4.8, 1.0, 2.1]
        expected = [1.0, 2.1, 2.1, 3.5, 4.8]
        heapSort(arr)
        self.assertEqual(arr, expected)

    def test_empty_array(self):
        arr = []
        expected = []
        heapSort(arr)
        self.assertEqual(arr, expected)

    def tearDown(self):
        print("Test case completed.\n")


if __name__ == '__main__':
    unittest.main()
